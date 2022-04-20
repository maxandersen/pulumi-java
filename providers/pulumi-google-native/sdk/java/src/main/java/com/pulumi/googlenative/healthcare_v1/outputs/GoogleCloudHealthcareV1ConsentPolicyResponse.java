// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.healthcare_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.healthcare_v1.outputs.AttributeResponse;
import com.pulumi.googlenative.healthcare_v1.outputs.ExprResponse;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GoogleCloudHealthcareV1ConsentPolicyResponse {
    /**
     * The request conditions to meet to grant access. In addition to any supported comparison operators, authorization rules may have `IN` operator as well as at most 10 logical operators that are limited to `AND` (`&amp;&amp;`), `OR` (`||`).
     * 
     */
    private final ExprResponse authorizationRule;
    /**
     * The resources that this policy applies to. A resource is a match if it matches all the attributes listed here. If empty, this policy applies to all User data mappings for the given user.
     * 
     */
    private final List<AttributeResponse> resourceAttributes;

    @CustomType.Constructor
    private GoogleCloudHealthcareV1ConsentPolicyResponse(
        @CustomType.Parameter("authorizationRule") ExprResponse authorizationRule,
        @CustomType.Parameter("resourceAttributes") List<AttributeResponse> resourceAttributes) {
        this.authorizationRule = authorizationRule;
        this.resourceAttributes = resourceAttributes;
    }

    /**
     * The request conditions to meet to grant access. In addition to any supported comparison operators, authorization rules may have `IN` operator as well as at most 10 logical operators that are limited to `AND` (`&amp;&amp;`), `OR` (`||`).
     * 
    */
    public ExprResponse authorizationRule() {
        return this.authorizationRule;
    }
    /**
     * The resources that this policy applies to. A resource is a match if it matches all the attributes listed here. If empty, this policy applies to all User data mappings for the given user.
     * 
    */
    public List<AttributeResponse> resourceAttributes() {
        return this.resourceAttributes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudHealthcareV1ConsentPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ExprResponse authorizationRule;
        private List<AttributeResponse> resourceAttributes;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudHealthcareV1ConsentPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authorizationRule = defaults.authorizationRule;
    	      this.resourceAttributes = defaults.resourceAttributes;
        }

        public Builder authorizationRule(ExprResponse authorizationRule) {
            this.authorizationRule = Objects.requireNonNull(authorizationRule);
            return this;
        }
        public Builder resourceAttributes(List<AttributeResponse> resourceAttributes) {
            this.resourceAttributes = Objects.requireNonNull(resourceAttributes);
            return this;
        }
        public Builder resourceAttributes(AttributeResponse... resourceAttributes) {
            return resourceAttributes(List.of(resourceAttributes));
        }        public GoogleCloudHealthcareV1ConsentPolicyResponse build() {
            return new GoogleCloudHealthcareV1ConsentPolicyResponse(authorizationRule, resourceAttributes);
        }
    }
}
