// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.costmanagement.inputs;

import com.pulumi.azurenative.costmanagement.enums.ReportConfigColumnType;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * The group by expression to be used in the report.
 * 
 */
public final class ReportConfigGroupingArgs extends com.pulumi.resources.ResourceArgs {

    public static final ReportConfigGroupingArgs Empty = new ReportConfigGroupingArgs();

    /**
     * The name of the column to group. This version supports subscription lowest possible grain.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of the column to group. This version supports subscription lowest possible grain.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * Has type of the column to group.
     * 
     */
    @Import(name="type", required=true)
    private Output<Either<String,ReportConfigColumnType>> type;

    /**
     * @return Has type of the column to group.
     * 
     */
    public Output<Either<String,ReportConfigColumnType>> type() {
        return this.type;
    }

    private ReportConfigGroupingArgs() {}

    private ReportConfigGroupingArgs(ReportConfigGroupingArgs $) {
        this.name = $.name;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ReportConfigGroupingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ReportConfigGroupingArgs $;

        public Builder() {
            $ = new ReportConfigGroupingArgs();
        }

        public Builder(ReportConfigGroupingArgs defaults) {
            $ = new ReportConfigGroupingArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the column to group. This version supports subscription lowest possible grain.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the column to group. This version supports subscription lowest possible grain.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param type Has type of the column to group.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<Either<String,ReportConfigColumnType>> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Has type of the column to group.
         * 
         * @return builder
         * 
         */
        public Builder type(Either<String,ReportConfigColumnType> type) {
            return type(Output.of(type));
        }

        /**
         * @param type Has type of the column to group.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Either.ofLeft(type));
        }

        /**
         * @param type Has type of the column to group.
         * 
         * @return builder
         * 
         */
        public Builder type(ReportConfigColumnType type) {
            return type(Either.ofRight(type));
        }

        public ReportConfigGroupingArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
