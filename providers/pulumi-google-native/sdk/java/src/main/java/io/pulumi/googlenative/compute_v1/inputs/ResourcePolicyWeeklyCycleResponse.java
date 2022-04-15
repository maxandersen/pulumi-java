// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.compute_v1.inputs.ResourcePolicyWeeklyCycleDayOfWeekResponse;
import java.util.List;
import java.util.Objects;


/**
 * Time window specified for weekly operations.
 * 
 */
public final class ResourcePolicyWeeklyCycleResponse extends io.pulumi.resources.InvokeArgs {

    public static final ResourcePolicyWeeklyCycleResponse Empty = new ResourcePolicyWeeklyCycleResponse();

    /**
     * Up to 7 intervals/windows, one for each day of the week.
     * 
     */
    @Import(name="dayOfWeeks", required=true)
      private final List<ResourcePolicyWeeklyCycleDayOfWeekResponse> dayOfWeeks;

    public List<ResourcePolicyWeeklyCycleDayOfWeekResponse> dayOfWeeks() {
        return this.dayOfWeeks;
    }

    public ResourcePolicyWeeklyCycleResponse(List<ResourcePolicyWeeklyCycleDayOfWeekResponse> dayOfWeeks) {
        this.dayOfWeeks = Objects.requireNonNull(dayOfWeeks, "expected parameter 'dayOfWeeks' to be non-null");
    }

    private ResourcePolicyWeeklyCycleResponse() {
        this.dayOfWeeks = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourcePolicyWeeklyCycleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<ResourcePolicyWeeklyCycleDayOfWeekResponse> dayOfWeeks;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourcePolicyWeeklyCycleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dayOfWeeks = defaults.dayOfWeeks;
        }

        public Builder dayOfWeeks(List<ResourcePolicyWeeklyCycleDayOfWeekResponse> dayOfWeeks) {
            this.dayOfWeeks = Objects.requireNonNull(dayOfWeeks);
            return this;
        }
        public Builder dayOfWeeks(ResourcePolicyWeeklyCycleDayOfWeekResponse... dayOfWeeks) {
            return dayOfWeeks(List.of(dayOfWeeks));
        }        public ResourcePolicyWeeklyCycleResponse build() {
            return new ResourcePolicyWeeklyCycleResponse(dayOfWeeks);
        }
    }
}
