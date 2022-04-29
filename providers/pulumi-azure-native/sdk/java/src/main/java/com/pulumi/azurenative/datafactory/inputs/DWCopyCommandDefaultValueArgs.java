// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.Object;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Default value.
 * 
 */
public final class DWCopyCommandDefaultValueArgs extends ResourceArgs {

    public static final DWCopyCommandDefaultValueArgs Empty = new DWCopyCommandDefaultValueArgs();

    /**
     * Column name. Type: object (or Expression with resultType string).
     * 
     */
    @Import(name="columnName")
    private @Nullable Output<Object> columnName;

    /**
     * @return Column name. Type: object (or Expression with resultType string).
     * 
     */
    public Optional<Output<Object>> columnName() {
        return Optional.ofNullable(this.columnName);
    }

    /**
     * The default value of the column. Type: object (or Expression with resultType string).
     * 
     */
    @Import(name="defaultValue")
    private @Nullable Output<Object> defaultValue;

    /**
     * @return The default value of the column. Type: object (or Expression with resultType string).
     * 
     */
    public Optional<Output<Object>> defaultValue() {
        return Optional.ofNullable(this.defaultValue);
    }

    private DWCopyCommandDefaultValueArgs() {}

    private DWCopyCommandDefaultValueArgs(DWCopyCommandDefaultValueArgs $) {
        this.columnName = $.columnName;
        this.defaultValue = $.defaultValue;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DWCopyCommandDefaultValueArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DWCopyCommandDefaultValueArgs $;

        public Builder() {
            $ = new DWCopyCommandDefaultValueArgs();
        }

        public Builder(DWCopyCommandDefaultValueArgs defaults) {
            $ = new DWCopyCommandDefaultValueArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param columnName Column name. Type: object (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder columnName(@Nullable Output<Object> columnName) {
            $.columnName = columnName;
            return this;
        }

        /**
         * @param columnName Column name. Type: object (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder columnName(Object columnName) {
            return columnName(Output.of(columnName));
        }

        /**
         * @param defaultValue The default value of the column. Type: object (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder defaultValue(@Nullable Output<Object> defaultValue) {
            $.defaultValue = defaultValue;
            return this;
        }

        /**
         * @param defaultValue The default value of the column. Type: object (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder defaultValue(Object defaultValue) {
            return defaultValue(Output.of(defaultValue));
        }

        public DWCopyCommandDefaultValueArgs build() {
            return $;
        }
    }

}
