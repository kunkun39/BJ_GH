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

SET FOREIGN_KEY_CHECKS=1;