// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datadog.outputs;

import io.pulumi.azurenative.datadog.outputs.LinkedResourceResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ListMonitorLinkedResourcesResult {
    /**
     * Link to the next set of results, if any.
     * 
     */
    private final @Nullable String nextLink;
    /**
     * Results of a list operation.
     * 
     */
    private final @Nullable List<LinkedResourceResponse> value;

    @CustomType.Constructor
    private ListMonitorLinkedResourcesResult(
        @CustomType.Parameter("nextLink") @Nullable String nextLink,
        @CustomType.Parameter("value") @Nullable List<LinkedResourceResponse> value) {
        this.nextLink = nextLink;
        this.value = value;
    }

    /**
     * Link to the next set of results, if any.
     * 
    */
    public Optional<String> nextLink() {
        return Optional.ofNullable(this.nextLink);
    }
    /**
     * Results of a list operation.
     * 
    */
    public List<LinkedResourceResponse> value() {
        return this.value == null ? List.of() : this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListMonitorLinkedResourcesResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String nextLink;
        private @Nullable List<LinkedResourceResponse> value;

        public Builder() {
    	      // Empty
        }

        public Builder(ListMonitorLinkedResourcesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nextLink = defaults.nextLink;
    	      this.value = defaults.value;
        }

        public Builder nextLink(@Nullable String nextLink) {
            this.nextLink = nextLink;
            return this;
        }
        public Builder value(@Nullable List<LinkedResourceResponse> value) {
            this.value = value;
            return this;
        }
        public Builder value(LinkedResourceResponse... value) {
            return value(List.of(value));
        }        public ListMonitorLinkedResourcesResult build() {
            return new ListMonitorLinkedResourcesResult(nextLink, value);
        }
    }
}
