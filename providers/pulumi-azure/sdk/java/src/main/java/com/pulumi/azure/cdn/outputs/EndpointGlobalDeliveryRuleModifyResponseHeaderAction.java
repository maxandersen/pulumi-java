// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.cdn.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class EndpointGlobalDeliveryRuleModifyResponseHeaderAction {
    /**
     * @return Action to be executed on a header value. Valid values are `Append`, `Delete` and `Overwrite`.
     * 
     */
    private final String action;
    /**
     * @return The header name.
     * 
     */
    private final String name;
    /**
     * @return The value of the header. Only needed when `action` is set to `Append` or `overwrite`.
     * 
     */
    private final @Nullable String value;

    @CustomType.Constructor
    private EndpointGlobalDeliveryRuleModifyResponseHeaderAction(
        @CustomType.Parameter("action") String action,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("value") @Nullable String value) {
        this.action = action;
        this.name = name;
        this.value = value;
    }

    /**
     * @return Action to be executed on a header value. Valid values are `Append`, `Delete` and `Overwrite`.
     * 
     */
    public String action() {
        return this.action;
    }
    /**
     * @return The header name.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The value of the header. Only needed when `action` is set to `Append` or `overwrite`.
     * 
     */
    public Optional<String> value() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EndpointGlobalDeliveryRuleModifyResponseHeaderAction defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String action;
        private String name;
        private @Nullable String value;

        public Builder() {
    	      // Empty
        }

        public Builder(EndpointGlobalDeliveryRuleModifyResponseHeaderAction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.name = defaults.name;
    	      this.value = defaults.value;
        }

        public Builder action(String action) {
            this.action = Objects.requireNonNull(action);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder value(@Nullable String value) {
            this.value = value;
            return this;
        }        public EndpointGlobalDeliveryRuleModifyResponseHeaderAction build() {
            return new EndpointGlobalDeliveryRuleModifyResponseHeaderAction(action, name, value);
        }
    }
}
