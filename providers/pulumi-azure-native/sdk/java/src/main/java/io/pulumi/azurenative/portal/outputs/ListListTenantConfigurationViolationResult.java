// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.portal.outputs;

import io.pulumi.azurenative.portal.outputs.ViolationResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ListListTenantConfigurationViolationResult {
    /**
     * The URL to use for getting the next set of results.
     * 
     */
    private final @Nullable String nextLink;
    /**
     * The array of violations.
     * 
     */
    private final @Nullable List<ViolationResponse> value;

    @CustomType.Constructor
    private ListListTenantConfigurationViolationResult(
        @CustomType.Parameter("nextLink") @Nullable String nextLink,
        @CustomType.Parameter("value") @Nullable List<ViolationResponse> value) {
        this.nextLink = nextLink;
        this.value = value;
    }

    /**
     * The URL to use for getting the next set of results.
     * 
    */
    public Optional<String> nextLink() {
        return Optional.ofNullable(this.nextLink);
    }
    /**
     * The array of violations.
     * 
    */
    public List<ViolationResponse> value() {
        return this.value == null ? List.of() : this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListListTenantConfigurationViolationResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String nextLink;
        private @Nullable List<ViolationResponse> value;

        public Builder() {
    	      // Empty
        }

        public Builder(ListListTenantConfigurationViolationResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nextLink = defaults.nextLink;
    	      this.value = defaults.value;
        }

        public Builder nextLink(@Nullable String nextLink) {
            this.nextLink = nextLink;
            return this;
        }
        public Builder value(@Nullable List<ViolationResponse> value) {
            this.value = value;
            return this;
        }
        public Builder value(ViolationResponse... value) {
            return value(List.of(value));
        }        public ListListTenantConfigurationViolationResult build() {
            return new ListListTenantConfigurationViolationResult(nextLink, value);
        }
    }
}
