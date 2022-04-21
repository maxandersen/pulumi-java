// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datastream_v1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.datastream_v1.inputs.MysqlColumnResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * MySQL table.
 * 
 */
public final class MysqlTableResponse extends com.pulumi.resources.InvokeArgs {

    public static final MysqlTableResponse Empty = new MysqlTableResponse();

    /**
     * MySQL columns in the database. When unspecified as part of include/exclude lists, includes/excludes everything.
     * 
     */
    @Import(name="mysqlColumns", required=true)
    private List<MysqlColumnResponse> mysqlColumns;

    public List<MysqlColumnResponse> mysqlColumns() {
        return this.mysqlColumns;
    }

    /**
     * Table name.
     * 
     */
    @Import(name="table", required=true)
    private String table;

    public String table() {
        return this.table;
    }

    private MysqlTableResponse() {}

    private MysqlTableResponse(MysqlTableResponse $) {
        this.mysqlColumns = $.mysqlColumns;
        this.table = $.table;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MysqlTableResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MysqlTableResponse $;

        public Builder() {
            $ = new MysqlTableResponse();
        }

        public Builder(MysqlTableResponse defaults) {
            $ = new MysqlTableResponse(Objects.requireNonNull(defaults));
        }

        public Builder mysqlColumns(List<MysqlColumnResponse> mysqlColumns) {
            $.mysqlColumns = mysqlColumns;
            return this;
        }

        public Builder mysqlColumns(MysqlColumnResponse... mysqlColumns) {
            return mysqlColumns(List.of(mysqlColumns));
        }

        public Builder table(String table) {
            $.table = table;
            return this;
        }

        public MysqlTableResponse build() {
            $.mysqlColumns = Objects.requireNonNull($.mysqlColumns, "expected parameter 'mysqlColumns' to be non-null");
            $.table = Objects.requireNonNull($.table, "expected parameter 'table' to be non-null");
            return $;
        }
    }

}
