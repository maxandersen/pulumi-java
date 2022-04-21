// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.operationalinsights.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The related metadata items for the function.
 * 
 */
public final class LogAnalyticsQueryPackQueryPropertiesRelatedArgs extends com.pulumi.resources.ResourceArgs {

    public static final LogAnalyticsQueryPackQueryPropertiesRelatedArgs Empty = new LogAnalyticsQueryPackQueryPropertiesRelatedArgs();

    /**
     * The related categories for the function.
     * 
     */
    @Import(name="categories")
    private @Nullable Output<List<String>> categories;

    public Optional<Output<List<String>>> categories() {
        return Optional.ofNullable(this.categories);
    }

    /**
     * The related resource types for the function.
     * 
     */
    @Import(name="resourceTypes")
    private @Nullable Output<List<String>> resourceTypes;

    public Optional<Output<List<String>>> resourceTypes() {
        return Optional.ofNullable(this.resourceTypes);
    }

    /**
     * The related Log Analytics solutions for the function.
     * 
     */
    @Import(name="solutions")
    private @Nullable Output<List<String>> solutions;

    public Optional<Output<List<String>>> solutions() {
        return Optional.ofNullable(this.solutions);
    }

    private LogAnalyticsQueryPackQueryPropertiesRelatedArgs() {}

    private LogAnalyticsQueryPackQueryPropertiesRelatedArgs(LogAnalyticsQueryPackQueryPropertiesRelatedArgs $) {
        this.categories = $.categories;
        this.resourceTypes = $.resourceTypes;
        this.solutions = $.solutions;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LogAnalyticsQueryPackQueryPropertiesRelatedArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LogAnalyticsQueryPackQueryPropertiesRelatedArgs $;

        public Builder() {
            $ = new LogAnalyticsQueryPackQueryPropertiesRelatedArgs();
        }

        public Builder(LogAnalyticsQueryPackQueryPropertiesRelatedArgs defaults) {
            $ = new LogAnalyticsQueryPackQueryPropertiesRelatedArgs(Objects.requireNonNull(defaults));
        }

        public Builder categories(@Nullable Output<List<String>> categories) {
            $.categories = categories;
            return this;
        }

        public Builder categories(List<String> categories) {
            return categories(Output.of(categories));
        }

        public Builder categories(String... categories) {
            return categories(List.of(categories));
        }

        public Builder resourceTypes(@Nullable Output<List<String>> resourceTypes) {
            $.resourceTypes = resourceTypes;
            return this;
        }

        public Builder resourceTypes(List<String> resourceTypes) {
            return resourceTypes(Output.of(resourceTypes));
        }

        public Builder resourceTypes(String... resourceTypes) {
            return resourceTypes(List.of(resourceTypes));
        }

        public Builder solutions(@Nullable Output<List<String>> solutions) {
            $.solutions = solutions;
            return this;
        }

        public Builder solutions(List<String> solutions) {
            return solutions(Output.of(solutions));
        }

        public Builder solutions(String... solutions) {
            return solutions(List.of(solutions));
        }

        public LogAnalyticsQueryPackQueryPropertiesRelatedArgs build() {
            return $;
        }
    }

}
