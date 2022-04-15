// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.azurenative.network.outputs.EffectiveVirtualNetworkResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ListEffectiveVirtualNetworkByNetworkManagerResult {
    /**
     * When present, the value can be passed to a subsequent query call (together with the same query and scopes used in the current request) to retrieve the next page of data.
     * 
     */
    private final @Nullable String skipToken;
    /**
     * Gets a page of EffectiveVirtualNetwork
     * 
     */
    private final @Nullable List<EffectiveVirtualNetworkResponse> value;

    @CustomType.Constructor
    private ListEffectiveVirtualNetworkByNetworkManagerResult(
        @CustomType.Parameter("skipToken") @Nullable String skipToken,
        @CustomType.Parameter("value") @Nullable List<EffectiveVirtualNetworkResponse> value) {
        this.skipToken = skipToken;
        this.value = value;
    }

    /**
     * When present, the value can be passed to a subsequent query call (together with the same query and scopes used in the current request) to retrieve the next page of data.
     * 
    */
    public Optional<String> skipToken() {
        return Optional.ofNullable(this.skipToken);
    }
    /**
     * Gets a page of EffectiveVirtualNetwork
     * 
    */
    public List<EffectiveVirtualNetworkResponse> value() {
        return this.value == null ? List.of() : this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListEffectiveVirtualNetworkByNetworkManagerResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String skipToken;
        private @Nullable List<EffectiveVirtualNetworkResponse> value;

        public Builder() {
    	      // Empty
        }

        public Builder(ListEffectiveVirtualNetworkByNetworkManagerResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.skipToken = defaults.skipToken;
    	      this.value = defaults.value;
        }

        public Builder skipToken(@Nullable String skipToken) {
            this.skipToken = skipToken;
            return this;
        }
        public Builder value(@Nullable List<EffectiveVirtualNetworkResponse> value) {
            this.value = value;
            return this;
        }
        public Builder value(EffectiveVirtualNetworkResponse... value) {
            return value(List.of(value));
        }        public ListEffectiveVirtualNetworkByNetworkManagerResult build() {
            return new ListEffectiveVirtualNetworkByNetworkManagerResult(skipToken, value);
        }
    }
}
