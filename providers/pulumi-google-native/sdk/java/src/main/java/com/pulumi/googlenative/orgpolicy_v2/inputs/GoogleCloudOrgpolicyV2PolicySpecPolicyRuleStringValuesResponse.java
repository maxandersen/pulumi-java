// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.orgpolicy_v2.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * A message that holds specific allowed and denied values. This message can define specific values and subtrees of Cloud Resource Manager resource hierarchy (`Organizations`, `Folders`, `Projects`) that are allowed or denied. This is achieved by using the `under:` and optional `is:` prefixes. The `under:` prefix is used to denote resource subtree values. The `is:` prefix is used to denote specific values, and is required only if the value contains a &#34;:&#34;. Values prefixed with &#34;is:&#34; are treated the same as values with no prefix. Ancestry subtrees must be in one of the following formats: - &#34;projects/&#34;, e.g. &#34;projects/tokyo-rain-123&#34; - &#34;folders/&#34;, e.g. &#34;folders/1234&#34; - &#34;organizations/&#34;, e.g. &#34;organizations/1234&#34; The `supports_under` field of the associated `Constraint` defines whether ancestry prefixes can be used.
 * 
 */
public final class GoogleCloudOrgpolicyV2PolicySpecPolicyRuleStringValuesResponse extends com.pulumi.resources.InvokeArgs {

    public static final GoogleCloudOrgpolicyV2PolicySpecPolicyRuleStringValuesResponse Empty = new GoogleCloudOrgpolicyV2PolicySpecPolicyRuleStringValuesResponse();

    /**
     * List of values allowed at this resource.
     * 
     */
    @Import(name="allowedValues", required=true)
    private List<String> allowedValues;

    public List<String> allowedValues() {
        return this.allowedValues;
    }

    /**
     * List of values denied at this resource.
     * 
     */
    @Import(name="deniedValues", required=true)
    private List<String> deniedValues;

    public List<String> deniedValues() {
        return this.deniedValues;
    }

    private GoogleCloudOrgpolicyV2PolicySpecPolicyRuleStringValuesResponse() {}

    private GoogleCloudOrgpolicyV2PolicySpecPolicyRuleStringValuesResponse(GoogleCloudOrgpolicyV2PolicySpecPolicyRuleStringValuesResponse $) {
        this.allowedValues = $.allowedValues;
        this.deniedValues = $.deniedValues;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudOrgpolicyV2PolicySpecPolicyRuleStringValuesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudOrgpolicyV2PolicySpecPolicyRuleStringValuesResponse $;

        public Builder() {
            $ = new GoogleCloudOrgpolicyV2PolicySpecPolicyRuleStringValuesResponse();
        }

        public Builder(GoogleCloudOrgpolicyV2PolicySpecPolicyRuleStringValuesResponse defaults) {
            $ = new GoogleCloudOrgpolicyV2PolicySpecPolicyRuleStringValuesResponse(Objects.requireNonNull(defaults));
        }

        public Builder allowedValues(List<String> allowedValues) {
            $.allowedValues = allowedValues;
            return this;
        }

        public Builder allowedValues(String... allowedValues) {
            return allowedValues(List.of(allowedValues));
        }

        public Builder deniedValues(List<String> deniedValues) {
            $.deniedValues = deniedValues;
            return this;
        }

        public Builder deniedValues(String... deniedValues) {
            return deniedValues(List.of(deniedValues));
        }

        public GoogleCloudOrgpolicyV2PolicySpecPolicyRuleStringValuesResponse build() {
            $.allowedValues = Objects.requireNonNull($.allowedValues, "expected parameter 'allowedValues' to be non-null");
            $.deniedValues = Objects.requireNonNull($.deniedValues, "expected parameter 'deniedValues' to be non-null");
            return $;
        }
    }

}
