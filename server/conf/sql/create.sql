SET FOREIGN_KEY_CHECKS=0;

DROP TABLE IF EXISTS `system_user`;
CREATE TABLE `system_user` (
  `id` int(11) NOT NULL auto_increment,
  `timestamp` timestamp default CURRENT_TIMESTAMP on update CURRENT_TIMESTAMP,
  `name` varchar(120) default NULL,
  `contactway` varchar(255) default '',
  `username` varchar(48) default '',
  `password` varchar(48) default '',
  `enabled` tinyint(1) default '0' COMMENT '1 for YES or 0 for NO',
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

DROP TABLE IF EXISTS `live_channel`;
CREATE TABLE `live_channel` (
  `id` int(36) NOT NULL auto_increment,
  `channel_id` int default 0,
  `timestamp` timestamp default CURRENT_TIMESTAMP on update CURRENT_TIMESTAMP,
  `channel_name` varchar(120) default null,
  `dvb_ts_id` varchar(255) default '',
  `dvb_Service_id` varchar(48) default '',
  `dvb_logicchannel_id` varchar(48) default '',
  `dvb_videocodec` varchar(255) default '',
  `dvb_audiocodec` varchar(255) default '',
  `channel_dec` varchar(255) default '',
  `dvb_bitrate` varchar(255) default '',
  `dvb_resolution` varchar(255) default '',
  `channel_type_id` varchar(255) default '',
  `channel_type` varchar(255) default '',
  `channel_icon` varchar(255) default '',
  `channel_image` varchar(255) default '',
  `video_type` varchar(255) default '',
  `fee_type` varchar(255) default '',
  `video_code_info` varchar(255) default '',
  `audio_code_info` varchar(255) default '',
  `mux_info` varchar(255) default '',
  `resolution_info` varchar(255) default '',
  `other_info_array` varchar(255) default '',
  `play_url` varchar(255) default '',

  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

DROP TABLE IF EXISTS `live_program_info`;
CREATE TABLE `live_program_info` (
  `id` int(36) NOT NULL auto_increment,
  `program_id` int default 0,
  `timestamp` timestamp default CURRENT_TIMESTAMP on update CURRENT_TIMESTAMP,
  `program_name` varchar(120) default '',
  `channel_id` int default 0,
  `channel_name` varchar(255) default '',
  `event_date` varchar(255) default '',
  `event_date_id` varchar(255) default '',
  `event_type` varchar(255) default '',
  `play_time` varchar(255) default '',
  `end_time` varchar(255) default '',
  `event_desc` varchar(255) default '',
  `video_type` varchar(255) default '',
  `view_level` varchar(255) default '',
  `play_url` varchar(255) default '',
  `bit_rate_info` varchar(255) default '',
  `event_image_url` varchar(255) default '',
  `assert_id` varchar(36) default '',
  `content_provider` varchar(255) default '',
  `local_entry_uid` varchar(255) default '',
  `product_offerin` varchar(255) default '',
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;



















