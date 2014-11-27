package com.changhong.client.web.servlet;

import com.changhong.client.service.ClientLiveService;
import com.changhong.client.service.ClientMovieService;
import com.changhong.common.web.application.ApplicationEventPublisher;
import com.changhong.system.domain.movietype.TypeEnum;
import org.springframework.web.bind.ServletRequestUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


/**
 * User: Jack Wang
 * Date: 14-11-21
 * Time: 下午3:00
 */

public class ClientDispatcherServlet extends HttpServlet {

    private ClientMovieService clientMovieService;

    private ClientLiveService clientLiveService;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if (clientMovieService == null) {
            clientMovieService = (ClientMovieService) ApplicationEventPublisher.getCtx().getBean("clientMovieService");
        }
        if (clientLiveService == null) {
            clientLiveService = (ClientLiveService) ApplicationEventPublisher.getCtx().getBean("clientLiveService");
        }

        String requestURL = request.getRequestURI();
        String responseJSON = "";

        //首页推荐操作
        if ("/ott/client/moviecolumn.action".equals(requestURL)) {
            String page = ServletRequestUtils.getStringParameter(request, "page", "");
            responseJSON = clientMovieService.obtainColumns(page);

        } else if ("/ott/client/movietype.action".equals(requestURL)) {
            String type = ServletRequestUtils.getStringParameter(request, "type", "");
            responseJSON = clientMovieService.obtainMovieType(TypeEnum.valueOf(type));

        } else if ("/ott/client/moviequery.action".equals(requestURL)) {
            String json = ServletRequestUtils.getStringParameter(request, "json", "");
            responseJSON = clientMovieService.obtainMovies(json);

        } else if ("/ott/client/moviedetails.action".equals(requestURL)) {
            String movieID = ServletRequestUtils.getStringParameter(request, "movieID", "");
            responseJSON = clientMovieService.obtainMovieByID(movieID);

        } else if ("/ott/client/movierecommend.action".equals(requestURL)) {
            String columnID = ServletRequestUtils.getStringParameter(request, "columnID", "");
            String typeID = ServletRequestUtils.getStringParameter(request, "typeID", "");
            responseJSON = clientMovieService.obtainMovieRecommend(columnID, typeID);

        } else if ("/ott/client/indexrecommend.action".equals(requestURL)) {
            String page = ServletRequestUtils.getStringParameter(request, "page", "");
            int size = ServletRequestUtils.getIntParameter(request, "size", 1);
            responseJSON = clientMovieService.obtainIndexRecommend(page, size);

        } else if ("/ott/client/livechannel.action".equals(requestURL)) {
            String json = ServletRequestUtils.getStringParameter(request, "json", "");
            responseJSON = clientLiveService.obtainLiveChannelsByType(json);

        } else if ("/ott/client/programepg.action".equals(requestURL)) {
            int channelID = ServletRequestUtils.getIntParameter(request, "channelID", 1);
            responseJSON = clientLiveService.obtainLiveProgramEPG(channelID, false);

        } else if ("/ott/client/programrollback.action".equals(requestURL)) {
            int channelID = ServletRequestUtils.getIntParameter(request, "channelID", 1);
            responseJSON = clientLiveService.obtainRollackProgramEPG(channelID, true);
        }

        //返回结果
        response.setContentType("application/json; charset=utf-8");
        PrintWriter writer = response.getWriter();
        writer.write(responseJSON);
        writer.flush();
        writer.close();
    }
}
