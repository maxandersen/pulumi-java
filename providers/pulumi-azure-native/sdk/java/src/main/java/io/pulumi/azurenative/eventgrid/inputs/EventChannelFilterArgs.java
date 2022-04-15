// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.eventgrid.inputs;

import io.pulumi.azurenative.eventgrid.inputs.BoolEqualsAdvancedFilterArgs;
import io.pulumi.azurenative.eventgrid.inputs.IsNotNullAdvancedFilterArgs;
import io.pulumi.azurenative.eventgrid.inputs.IsNullOrUndefinedAdvancedFilterArgs;
import io.pulumi.azurenative.eventgrid.inputs.NumberGreaterThanAdvancedFilterArgs;
import io.pulumi.azurenative.eventgrid.inputs.NumberGreaterThanOrEqualsAdvancedFilterArgs;
import io.pulumi.azurenative.eventgrid.inputs.NumberInAdvancedFilterArgs;
import io.pulumi.azurenative.eventgrid.inputs.NumberInRangeAdvancedFilterArgs;
import io.pulumi.azurenative.eventgrid.inputs.NumberLessThanAdvancedFilterArgs;
import io.pulumi.azurenative.eventgrid.inputs.NumberLessThanOrEqualsAdvancedFilterArgs;
import io.pulumi.azurenative.eventgrid.inputs.NumberNotInAdvancedFilterArgs;
import io.pulumi.azurenative.eventgrid.inputs.NumberNotInRangeAdvancedFilterArgs;
import io.pulumi.azurenative.eventgrid.inputs.StringBeginsWithAdvancedFilterArgs;
import io.pulumi.azurenative.eventgrid.inputs.StringContainsAdvancedFilterArgs;
import io.pulumi.azurenative.eventgrid.inputs.StringEndsWithAdvancedFilterArgs;
import io.pulumi.azurenative.eventgrid.inputs.StringInAdvancedFilterArgs;
import io.pulumi.azurenative.eventgrid.inputs.StringNotBeginsWithAdvancedFilterArgs;
import io.pulumi.azurenative.eventgrid.inputs.StringNotContainsAdvancedFilterArgs;
import io.pulumi.azurenative.eventgrid.inputs.StringNotEndsWithAdvancedFilterArgs;
import io.pulumi.azurenative.eventgrid.inputs.StringNotInAdvancedFilterArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Object;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Filter for the Event Channel.
 * 
 */
public final class EventChannelFilterArgs extends io.pulumi.resources.ResourceArgs {

    public static final EventChannelFilterArgs Empty = new EventChannelFilterArgs();

    /**
     * An array of advanced filters that are used for filtering event channels.
     * 
     */
    @Import(name="advancedFilters")
      private final @Nullable Output<List<Object>> advancedFilters;

    public Output<List<Object>> advancedFilters() {
        return this.advancedFilters == null ? Codegen.empty() : this.advancedFilters;
    }

    /**
     * Allows advanced filters to be evaluated against an array of values instead of expecting a singular value. The default value is either false or null.
     * 
     */
    @Import(name="enableAdvancedFilteringOnArrays")
      private final @Nullable Output<Boolean> enableAdvancedFilteringOnArrays;

    public Output<Boolean> enableAdvancedFilteringOnArrays() {
        return this.enableAdvancedFilteringOnArrays == null ? Codegen.empty() : this.enableAdvancedFilteringOnArrays;
    }

    public EventChannelFilterArgs(
        @Nullable Output<List<Object>> advancedFilters,
        @Nullable Output<Boolean> enableAdvancedFilteringOnArrays) {
        this.advancedFilters = advancedFilters;
        this.enableAdvancedFilteringOnArrays = enableAdvancedFilteringOnArrays == null ? Codegen.ofNullable(false) : enableAdvancedFilteringOnArrays;
    }

    private EventChannelFilterArgs() {
        this.advancedFilters = Codegen.empty();
        this.enableAdvancedFilteringOnArrays = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventChannelFilterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<Object>> advancedFilters;
        private @Nullable Output<Boolean> enableAdvancedFilteringOnArrays;

        public Builder() {
    	      // Empty
        }

        public Builder(EventChannelFilterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.advancedFilters = defaults.advancedFilters;
    	      this.enableAdvancedFilteringOnArrays = defaults.enableAdvancedFilteringOnArrays;
        }

        public Builder advancedFilters(@Nullable Output<List<Object>> advancedFilters) {
            this.advancedFilters = advancedFilters;
            return this;
        }
        public Builder advancedFilters(@Nullable List<Object> advancedFilters) {
            this.advancedFilters = Codegen.ofNullable(advancedFilters);
            return this;
        }
        public Builder advancedFilters(Object... advancedFilters) {
            return advancedFilters(List.of(advancedFilters));
        }
        public Builder enableAdvancedFilteringOnArrays(@Nullable Output<Boolean> enableAdvancedFilteringOnArrays) {
            this.enableAdvancedFilteringOnArrays = enableAdvancedFilteringOnArrays;
            return this;
        }
        public Builder enableAdvancedFilteringOnArrays(@Nullable Boolean enableAdvancedFilteringOnArrays) {
            this.enableAdvancedFilteringOnArrays = Codegen.ofNullable(enableAdvancedFilteringOnArrays);
            return this;
        }        public EventChannelFilterArgs build() {
            return new EventChannelFilterArgs(advancedFilters, enableAdvancedFilteringOnArrays);
        }
    }
}
