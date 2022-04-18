// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.quicksight.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    @EnumType
    public enum DataSourceType {
        AdobeAnalytics("ADOBE_ANALYTICS"),
        AmazonElasticsearch("AMAZON_ELASTICSEARCH"),
        AmazonOpensearch("AMAZON_OPENSEARCH"),
        Athena("ATHENA"),
        Aurora("AURORA"),
        AuroraPostgresql("AURORA_POSTGRESQL"),
        AwsIotAnalytics("AWS_IOT_ANALYTICS"),
        Github("GITHUB"),
        Jira("JIRA"),
        Mariadb("MARIADB"),
        Mysql("MYSQL"),
        Oracle("ORACLE"),
        Postgresql("POSTGRESQL"),
        Presto("PRESTO"),
        Redshift("REDSHIFT"),
        S3("S3"),
        Salesforce("SALESFORCE"),
        Servicenow("SERVICENOW"),
        Snowflake("SNOWFLAKE"),
        Spark("SPARK"),
        Sqlserver("SQLSERVER"),
        Teradata("TERADATA"),
        Twitter("TWITTER"),
        Timestream("TIMESTREAM");

        private final String value;

        DataSourceType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "DataSourceType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
