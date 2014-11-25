SET FOREIGN_KEY_CHECKS=0;

DROP TABLE IF EXISTS `movie_type`;
CREATE TABLE `movie_type` (
  `id` int(11) NOT NULL auto_increment,
  `timestamp` timestamp default CURRENT_TIMESTAMP on update CURRENT_TIMESTAMP,
  `type_id` varchar(10) default '',
  `type_name` varchar(40) default '',
  `type_sequence` int default 0,
  `drama_type_id` varchar(100) default '',
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;
ALTER TABLE `movie_type` ADD INDEX  movie_type_index_id(`type_id`);

DROP TABLE IF EXISTS `movie_drama_type`;
CREATE TABLE `movie_drama_type` (
  `id` int(11) NOT NULL auto_increment,
  `timestamp` timestamp default CURRENT_TIMESTAMP on update CURRENT_TIMESTAMP,
  `drama_type_id` varchar(10) default '',
  `drama_type_name` varchar(60) default '',
  `drama_type_sequence` int default 0,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;
ALTER TABLE `movie_drama_type` ADD INDEX  movie_drama_type_index_id(`drama_type_id`);

DROP TABLE IF EXISTS `movie_area`;
CREATE TABLE `movie_area` (
  `id` int(11) NOT NULL auto_increment,
  `timestamp` timestamp default CURRENT_TIMESTAMP on update CURRENT_TIMESTAMP,
  `area_id` varchar(10) default '',
  `area_name` varchar(40) default '',
  `area_group_id` varchar(100) default '',
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;
ALTER TABLE `movie_area` ADD INDEX  movie_area_index_id(`area_id`);

DROP TABLE IF EXISTS `movie_area_group`;
CREATE TABLE `movie_area_group` (
  `id` int(11) NOT NULL auto_increment,
  `timestamp` timestamp default CURRENT_TIMESTAMP on update CURRENT_TIMESTAMP,
  `area_group_id` varchar(10) default '',
  `area_group_name` varchar(40) default '',
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;
ALTER TABLE `movie_area_group` ADD INDEX  movie_area_group_index_id(`area_group_id`);

DROP TABLE IF EXISTS `movie_client_type`;
CREATE TABLE `movie_client_type` (
  `id` int(11) NOT NULL auto_increment,
  `timestamp` timestamp default CURRENT_TIMESTAMP on update CURRENT_TIMESTAMP,
  `client_type_id` varchar(10) default '',
  `client_type_name` varchar(40) default '',
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;
ALTER TABLE `movie_client_type` ADD INDEX  movie_client_type_index_id(`client_type_id`);

DROP TABLE IF EXISTS `movie_channel_type`;
CREATE TABLE `movie_channel_type` (
  `id` int(11) NOT NULL auto_increment,
  `timestamp` timestamp default CURRENT_TIMESTAMP on update CURRENT_TIMESTAMP,
  `channel_type_id` varchar(10) default '',
  `channel_type_name` varchar(40) default '',
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;
ALTER TABLE `movie_channel_type` ADD INDEX  movie_channel_type_index_id(`channel_type_id`);

DROP TABLE IF EXISTS `movie_event_type`;
CREATE TABLE `movie_event_type` (
  `id` int(11) NOT NULL auto_increment,
  `timestamp` timestamp default CURRENT_TIMESTAMP on update CURRENT_TIMESTAMP,
  `event_type_id` varchar(10) default '',
  `event_type_name` varchar(40) default '',
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;
ALTER TABLE `movie_event_type` ADD INDEX  movie_event_type_index_id(`event_type_id`);

DROP TABLE IF EXISTS `movie_provider_type`;
CREATE TABLE `movie_provider_type` (
  `id` int(11) NOT NULL auto_increment,
  `timestamp` timestamp default CURRENT_TIMESTAMP on update CURRENT_TIMESTAMP,
  `provider_id` varchar(10) default '',
  `provider_name` varchar(40) default '',
  `provider_type` varchar(40) default '',
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;
ALTER TABLE `movie_provider_type` ADD INDEX  movie_provider_type_index_id(`provider_id`);

DROP TABLE IF EXISTS `movie_column`;
CREATE TABLE `movie_column` (
  `id` int(11) NOT NULL auto_increment,
  `timestamp` timestamp default CURRENT_TIMESTAMP on update CURRENT_TIMESTAMP,
  `column_id` varchar(10) default '',
  `column_type_code` varchar(10) default '',
  `column_type` varchar(5) default '',
  `column_parent_id` varchar(40) default '',
  `column_name` varchar(40) default '',
  `column_alias` varchar(40) default '',
  `column_describe` text,
  `column_display` varchar(5) default '',
  `column_rank` varchar(5) default '',
  `column_url` varchar(50) default '',
  `column_url_type` varchar(5) default '',
  `column_update_time` varchar(48) default '',
  `column_relevant_chargemode` varchar(5) default '',
  `column_product_id` varchar(10) default '',
  `column_resource_type` varchar(10) default '',
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;
ALTER TABLE `movie_column` ADD INDEX  movie_column_index_id(`column_id`);
ALTER TABLE `movie_column` ADD INDEX  movie_column_index_parentid(`column_parent_id`);

DROP TABLE IF EXISTS `movie_info`;
CREATE TABLE `movie_info` (
  `id` int(11) NOT NULL auto_increment,
  `timestamp` timestamp default CURRENT_TIMESTAMP on update CURRENT_TIMESTAMP,
  `recommend_page` varchar(10) default '',
  `recommend` tinyint(1) default '0' COMMENT '1 for YES or 0 for NO',
  `column_id` varchar(10) default '',
  `movie_id` varchar(10) default '',
  `movie_name` varchar(80) default '',
  `movie_alias_name` varchar(240) default '',
  `movie_type` varchar(40) default '',
  `movie_type_id` varchar(10) default '',
  `drama_type` varchar(40) default '',
  `drama_type_id` varchar(10) default '',
  `movie_area` varchar(40) default '',
  `movie_area_id` varchar(10) default '',
  `movie_year` varchar(4) default '',
  `movie_director` varchar(80) default '',
  `movie_actor` varchar(200) default '',
  `movie_host` varchar(40) default '',
  `movie_station` varchar(40) default '',
  `movie_author` varchar(40) default '',
  `movie_runtime` varchar(5) default '',
  `movie_count` int default 0,
  `movie_summaryshort` text,
  `movie_commentary` varchar(80) default '',
  `movie_tag` varchar(60) default '',
  `movie_suggestprice` varchar(10) default '',
  `movie_recommendclass1` double(2,1) default 0,
  `movie_recommendclass2` double(2,1) default 0,
  `movie_recommendclass3` double(2,1) default 0,
  `movie_recommendclass4` double(2,1) default 0,
  `movie_otherinfoarray` varchar(40) default '',
  `play_platform` varchar(10) default '',
  `play_assetid` varchar(10) default '',
  `play_assetname` varchar(10) default '',
  `play_contentproviderid` varchar(10) default '',
  `play_localentryuid` varchar(40) default '',
  `play_productofferinguid` varchar(40) default '',
  `play_url` varchar(200) default '',
  `play_urlid` varchar(10) default '',
  `play_swfurl` varchar(200) default '',
  `play_maincache_url` varchar(200) default '',
  `play_series` varchar(40) default '',
  `play_singlepriceinfos` varchar(40) default '',
  `play_copyrightinfo` varchar(100) default '',
  `play_videocodecinfo` varchar(100) default '',
  `play_audiocodecinfo` varchar(100) default '',
  `play_muxInfo` varchar(100) default '',
  `play_runtimeinfo` varchar(100) default '',
  `play_resolutioninfo` varchar(100) default '',
  `play_bitrateinfo` varchar(100) default '',
  `play_otherinfoarray` varchar(40) default '',
  `play_contentprovideridarray` varchar(40) default '',
  `play_seriesarray` varchar(80) default '',
  `poster_id` varchar(10) default '',
  `poster_imageurl` varchar(200) default '',
  `poster_aspectratio` varchar(100) default '',
  `poster_series` varchar(100) default '',
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;
ALTER TABLE `movie_info` ADD INDEX  movie_column_index_recommendpage(`recommend_page`);
ALTER TABLE `movie_info` ADD INDEX  movie_column_index_recommend(`recommend`);
ALTER TABLE `movie_info` ADD INDEX  movie_column_index_columnid(`column_id`);
ALTER TABLE `movie_info` ADD INDEX  movie_column_index_id(`movie_id`);
ALTER TABLE `movie_info` ADD INDEX  movie_column_index_typeid(`movie_type_id`);
ALTER TABLE `movie_info` ADD INDEX  movie_column_index_dramatypeid(`drama_type_id`);
ALTER TABLE `movie_info` ADD INDEX  movie_column_index_movieareaid(`movie_area_id`);
ALTER TABLE `movie_info` ADD INDEX  movie_column_index_movieyear(`movie_year`);

SET FOREIGN_KEY_CHECKS=1;