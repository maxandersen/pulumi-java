// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.customerinsights.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Connector mapping property structure.
 * 
 */
public final class ConnectorMappingStructureArgs extends ResourceArgs {

    public static final ConnectorMappingStructureArgs Empty = new ConnectorMappingStructureArgs();

    /**
     * The column name of the import file.
     * 
     */
    @Import(name="columnName", required=true)
    private Output<String> columnName;

    /**
     * @return The column name of the import file.
     * 
     */
    public Output<String> columnName() {
        return this.columnName;
    }

    /**
     * Custom format specifier for input parsing.
     * 
     */
    @Import(name="customFormatSpecifier")
    private @Nullable Output<String> customFormatSpecifier;

    /**
     * @return Custom format specifier for input parsing.
     * 
     */
    public Optional<Output<String>> customFormatSpecifier() {
        return Optional.ofNullable(this.customFormatSpecifier);
    }

    /**
     * Indicates if the column is encrypted.
     * 
     */
    @Import(name="isEncrypted")
    private @Nullable Output<Boolean> isEncrypted;

    /**
     * @return Indicates if the column is encrypted.
     * 
     */
    public Optional<Output<Boolean>> isEncrypted() {
        return Optional.ofNullable(this.isEncrypted);
    }

    /**
     * The property name of the mapping entity.
     * 
     */
    @Import(name="propertyName", required=true)
    private Output<String> propertyName;

    /**
     * @return The property name of the mapping entity.
     * 
     */
    public Output<String> propertyName() {
        return this.propertyName;
    }

    private ConnectorMappingStructureArgs() {}

    private ConnectorMappingStructureArgs(ConnectorMappingStructureArgs $) {
        this.columnName = $.columnName;
        this.customFormatSpecifier = $.customFormatSpecifier;
        this.isEncrypted = $.isEncrypted;
        this.propertyName = $.propertyName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConnectorMappingStructureArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConnectorMappingStructureArgs $;

        public Builder() {
            $ = new ConnectorMappingStructureArgs();
        }

        public Builder(ConnectorMappingStructureArgs defaults) {
            $ = new ConnectorMappingStructureArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param columnName The column name of the import file.
         * 
         * @return builder
         * 
         */
        public Builder columnName(Output<String> columnName) {
            $.columnName = columnName;
            return this;
        }

        /**
         * @param columnName The column name of the import file.
         * 
         * @return builder
         * 
         */
        public Builder columnName(String columnName) {
            return columnName(Output.of(columnName));
        }

        /**
         * @param customFormatSpecifier Custom format specifier for input parsing.
         * 
         * @return builder
         * 
         */
        public Builder customFormatSpecifier(@Nullable Output<String> customFormatSpecifier) {
            $.customFormatSpecifier = customFormatSpecifier;
            return this;
        }

        /**
         * @param customFormatSpecifier Custom format specifier for input parsing.
         * 
         * @return builder
         * 
         */
        public Builder customFormatSpecifier(String customFormatSpecifier) {
            return customFormatSpecifier(Output.of(customFormatSpecifier));
        }

        /**
         * @param isEncrypted Indicates if the column is encrypted.
         * 
         * @return builder
         * 
         */
        public Builder isEncrypted(@Nullable Output<Boolean> isEncrypted) {
            $.isEncrypted = isEncrypted;
            return this;
        }

        /**
         * @param isEncrypted Indicates if the column is encrypted.
         * 
         * @return builder
         * 
         */
        public Builder isEncrypted(Boolean isEncrypted) {
            return isEncrypted(Output.of(isEncrypted));
        }

        /**
         * @param propertyName The property name of the mapping entity.
         * 
         * @return builder
         * 
         */
        public Builder propertyName(Output<String> propertyName) {
            $.propertyName = propertyName;
            return this;
        }

        /**
         * @param propertyName The property name of the mapping entity.
         * 
         * @return builder
         * 
         */
        public Builder propertyName(String propertyName) {
            return propertyName(Output.of(propertyName));
        }

        public ConnectorMappingStructureArgs build() {
            $.columnName = Objects.requireNonNull($.columnName, "expected parameter 'columnName' to be non-null");
            $.propertyName = Objects.requireNonNull($.propertyName, "expected parameter 'propertyName' to be non-null");
            return $;
        }
    }

}
