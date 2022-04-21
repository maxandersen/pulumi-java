// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datastream_v1alpha1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


/**
 * MySQL Column.
 * 
 */
public final class MysqlColumnResponse extends com.pulumi.resources.InvokeArgs {

    public static final MysqlColumnResponse Empty = new MysqlColumnResponse();

    /**
     * Column collation.
     * 
     */
    @Import(name="collation", required=true)
    private String collation;

    public String collation() {
        return this.collation;
    }

    /**
     * Column name.
     * 
     */
    @Import(name="columnName", required=true)
    private String columnName;

    public String columnName() {
        return this.columnName;
    }

    /**
     * The MySQL data type. Full data types list can be found here: https://dev.mysql.com/doc/refman/8.0/en/data-types.html
     * 
     */
    @Import(name="dataType", required=true)
    private String dataType;

    public String dataType() {
        return this.dataType;
    }

    /**
     * Column length.
     * 
     */
    @Import(name="length", required=true)
    private Integer length;

    public Integer length() {
        return this.length;
    }

    /**
     * Whether or not the column can accept a null value.
     * 
     */
    @Import(name="nullable", required=true)
    private Boolean nullable;

    public Boolean nullable() {
        return this.nullable;
    }

    /**
     * The ordinal position of the column in the table.
     * 
     */
    @Import(name="ordinalPosition", required=true)
    private Integer ordinalPosition;

    public Integer ordinalPosition() {
        return this.ordinalPosition;
    }

    /**
     * Whether or not the column represents a primary key.
     * 
     */
    @Import(name="primaryKey", required=true)
    private Boolean primaryKey;

    public Boolean primaryKey() {
        return this.primaryKey;
    }

    private MysqlColumnResponse() {}

    private MysqlColumnResponse(MysqlColumnResponse $) {
        this.collation = $.collation;
        this.columnName = $.columnName;
        this.dataType = $.dataType;
        this.length = $.length;
        this.nullable = $.nullable;
        this.ordinalPosition = $.ordinalPosition;
        this.primaryKey = $.primaryKey;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MysqlColumnResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MysqlColumnResponse $;

        public Builder() {
            $ = new MysqlColumnResponse();
        }

        public Builder(MysqlColumnResponse defaults) {
            $ = new MysqlColumnResponse(Objects.requireNonNull(defaults));
        }

        public Builder collation(String collation) {
            $.collation = collation;
            return this;
        }

        public Builder columnName(String columnName) {
            $.columnName = columnName;
            return this;
        }

        public Builder dataType(String dataType) {
            $.dataType = dataType;
            return this;
        }

        public Builder length(Integer length) {
            $.length = length;
            return this;
        }

        public Builder nullable(Boolean nullable) {
            $.nullable = nullable;
            return this;
        }

        public Builder ordinalPosition(Integer ordinalPosition) {
            $.ordinalPosition = ordinalPosition;
            return this;
        }

        public Builder primaryKey(Boolean primaryKey) {
            $.primaryKey = primaryKey;
            return this;
        }

        public MysqlColumnResponse build() {
            $.collation = Objects.requireNonNull($.collation, "expected parameter 'collation' to be non-null");
            $.columnName = Objects.requireNonNull($.columnName, "expected parameter 'columnName' to be non-null");
            $.dataType = Objects.requireNonNull($.dataType, "expected parameter 'dataType' to be non-null");
            $.length = Objects.requireNonNull($.length, "expected parameter 'length' to be non-null");
            $.nullable = Objects.requireNonNull($.nullable, "expected parameter 'nullable' to be non-null");
            $.ordinalPosition = Objects.requireNonNull($.ordinalPosition, "expected parameter 'ordinalPosition' to be non-null");
            $.primaryKey = Objects.requireNonNull($.primaryKey, "expected parameter 'primaryKey' to be non-null");
            return $;
        }
    }

}
