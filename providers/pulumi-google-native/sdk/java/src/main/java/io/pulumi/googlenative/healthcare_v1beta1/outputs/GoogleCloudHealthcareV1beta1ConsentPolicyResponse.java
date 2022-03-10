// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.healthcare_v1beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.healthcare_v1beta1.outputs.AttributeResponse;
import io.pulumi.googlenative.healthcare_v1beta1.outputs.ExprResponse;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudHealthcareV1beta1ConsentPolicyResponse {
    /**
     * The request conditions to meet to grant access. In addition to any supported comparison operators, authorization rules may have `IN` operator as well as at most 10 logical operators that are limited to `AND` (`&&`), `OR` (`||`).
     * 
     */
    private final ExprResponse authorizationRule;
    /**
     * The resources that this policy applies to. A resource is a match if it matches all the attributes listed here. If empty, this policy applies to all User data mappings for the given user.
     * 
     */
    private final List<AttributeResponse> resourceAttributes;

    @OutputCustomType.Constructor
    private GoogleCloudHealthcareV1beta1ConsentPolicyResponse(
        @OutputCustomType.Parameter("authorizationRule") ExprResponse authorizationRule,
        @OutputCustomType.Parameter("resourceAttributes") List<AttributeResponse> resourceAttributes) {
        this.authorizationRule = authorizationRule;
        this.resourceAttributes = resourceAttributes;
    }

    /**
     * The request conditions to meet to grant access. In addition to any supported comparison operators, authorization rules may have `IN` operator as well as at most 10 logical operators that are limited to `AND` (`&&`), `OR` (`||`).
     * 
    */
    public ExprResponse getAuthorizationRule() {
        return this.authorizationRule;
    }
    /**
     * The resources that this policy applies to. A resource is a match if it matches all the attributes listed here. If empty, this policy applies to all User data mappings for the given user.
     * 
    */
    public List<AttributeResponse> getResourceAttributes() {
        return this.resourceAttributes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudHealthcareV1beta1ConsentPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ExprResponse authorizationRule;
        private List<AttributeResponse> resourceAttributes;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudHealthcareV1beta1ConsentPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authorizationRule = defaults.authorizationRule;
    	      this.resourceAttributes = defaults.resourceAttributes;
        }

        public Builder setAuthorizationRule(ExprResponse authorizationRule) {
            this.authorizationRule = Objects.requireNonNull(authorizationRule);
            return this;
        }

        public Builder setResourceAttributes(List<AttributeResponse> resourceAttributes) {
            this.resourceAttributes = Objects.requireNonNull(resourceAttributes);
            return this;
        }
        public GoogleCloudHealthcareV1beta1ConsentPolicyResponse build() {
            return new GoogleCloudHealthcareV1beta1ConsentPolicyResponse(authorizationRule, resourceAttributes);
        }
    }
}
