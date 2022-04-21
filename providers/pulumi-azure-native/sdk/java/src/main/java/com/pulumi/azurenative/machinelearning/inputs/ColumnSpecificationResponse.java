// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearning.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Swagger 2.0 schema for a column within the data table representing a web service input or output. See Swagger specification: http://swagger.io/specification/
 * 
 */
public final class ColumnSpecificationResponse extends com.pulumi.resources.InvokeArgs {

    public static final ColumnSpecificationResponse Empty = new ColumnSpecificationResponse();

    /**
     * If the data type is categorical, this provides the list of accepted categories.
     * 
     */
    @Import(name="enum")
    private @Nullable List<Object> enum_;

    public Optional<List<Object>> enum_() {
        return Optional.ofNullable(this.enum_);
    }

    /**
     * Additional format information for the data type.
     * 
     */
    @Import(name="format")
    private @Nullable String format;

    public Optional<String> format() {
        return Optional.ofNullable(this.format);
    }

    /**
     * Data type of the column.
     * 
     */
    @Import(name="type", required=true)
    private String type;

    public String type() {
        return this.type;
    }

    /**
     * Flag indicating if the type supports null values or not.
     * 
     */
    @Import(name="xMsIsnullable")
    private @Nullable Boolean xMsIsnullable;

    public Optional<Boolean> xMsIsnullable() {
        return Optional.ofNullable(this.xMsIsnullable);
    }

    /**
     * Flag indicating whether the categories are treated as an ordered set or not, if this is a categorical column.
     * 
     */
    @Import(name="xMsIsordered")
    private @Nullable Boolean xMsIsordered;

    public Optional<Boolean> xMsIsordered() {
        return Optional.ofNullable(this.xMsIsordered);
    }

    private ColumnSpecificationResponse() {}

    private ColumnSpecificationResponse(ColumnSpecificationResponse $) {
        this.enum_ = $.enum_;
        this.format = $.format;
        this.type = $.type;
        this.xMsIsnullable = $.xMsIsnullable;
        this.xMsIsordered = $.xMsIsordered;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ColumnSpecificationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ColumnSpecificationResponse $;

        public Builder() {
            $ = new ColumnSpecificationResponse();
        }

        public Builder(ColumnSpecificationResponse defaults) {
            $ = new ColumnSpecificationResponse(Objects.requireNonNull(defaults));
        }

        public Builder enum_(@Nullable List<Object> enum_) {
            $.enum_ = enum_;
            return this;
        }

        public Builder enum_(Object... enum_) {
            return enum_(List.of(enum_));
        }

        public Builder format(@Nullable String format) {
            $.format = format;
            return this;
        }

        public Builder type(String type) {
            $.type = type;
            return this;
        }

        public Builder xMsIsnullable(@Nullable Boolean xMsIsnullable) {
            $.xMsIsnullable = xMsIsnullable;
            return this;
        }

        public Builder xMsIsordered(@Nullable Boolean xMsIsordered) {
            $.xMsIsordered = xMsIsordered;
            return this;
        }

        public ColumnSpecificationResponse build() {
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
