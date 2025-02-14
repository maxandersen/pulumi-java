// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.mobilenetwork.outputs;

import com.pulumi.azurenative.mobilenetwork.outputs.SubResourceResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class ListMobileNetworkSimIdsResult {
    /**
     * @return The URL to get the next set of results.
     * 
     */
    private final String nextLink;
    /**
     * @return A list of sim profile ids in a resource group.
     * 
     */
    private final @Nullable List<SubResourceResponse> value;

    @CustomType.Constructor
    private ListMobileNetworkSimIdsResult(
        @CustomType.Parameter("nextLink") String nextLink,
        @CustomType.Parameter("value") @Nullable List<SubResourceResponse> value) {
        this.nextLink = nextLink;
        this.value = value;
    }

    /**
     * @return The URL to get the next set of results.
     * 
     */
    public String nextLink() {
        return this.nextLink;
    }
    /**
     * @return A list of sim profile ids in a resource group.
     * 
     */
    public List<SubResourceResponse> value() {
        return this.value == null ? List.of() : this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListMobileNetworkSimIdsResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String nextLink;
        private @Nullable List<SubResourceResponse> value;

        public Builder() {
    	      // Empty
        }

        public Builder(ListMobileNetworkSimIdsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nextLink = defaults.nextLink;
    	      this.value = defaults.value;
        }

        public Builder nextLink(String nextLink) {
            this.nextLink = Objects.requireNonNull(nextLink);
            return this;
        }
        public Builder value(@Nullable List<SubResourceResponse> value) {
            this.value = value;
            return this;
        }
        public Builder value(SubResourceResponse... value) {
            return value(List.of(value));
        }        public ListMobileNetworkSimIdsResult build() {
            return new ListMobileNetworkSimIdsResult(nextLink, value);
        }
    }
}
