// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.servicemanagement_v1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.servicemanagement_v1.inputs.CustomErrorRuleResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Customize service error responses. For example, list any service specific protobuf types that can appear in error detail lists of error responses. Example: custom_error: types: - google.foo.v1.CustomError - google.foo.v1.AnotherError
 * 
 */
public final class CustomErrorResponse extends com.pulumi.resources.InvokeArgs {

    public static final CustomErrorResponse Empty = new CustomErrorResponse();

    /**
     * The list of custom error rules that apply to individual API messages. **NOTE:** All service configuration rules follow &#34;last one wins&#34; order.
     * 
     */
    @Import(name="rules", required=true)
    private List<CustomErrorRuleResponse> rules;

    public List<CustomErrorRuleResponse> rules() {
        return this.rules;
    }

    /**
     * The list of custom error detail types, e.g. &#39;google.foo.v1.CustomError&#39;.
     * 
     */
    @Import(name="types", required=true)
    private List<String> types;

    public List<String> types() {
        return this.types;
    }

    private CustomErrorResponse() {}

    private CustomErrorResponse(CustomErrorResponse $) {
        this.rules = $.rules;
        this.types = $.types;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CustomErrorResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CustomErrorResponse $;

        public Builder() {
            $ = new CustomErrorResponse();
        }

        public Builder(CustomErrorResponse defaults) {
            $ = new CustomErrorResponse(Objects.requireNonNull(defaults));
        }

        public Builder rules(List<CustomErrorRuleResponse> rules) {
            $.rules = rules;
            return this;
        }

        public Builder rules(CustomErrorRuleResponse... rules) {
            return rules(List.of(rules));
        }

        public Builder types(List<String> types) {
            $.types = types;
            return this;
        }

        public Builder types(String... types) {
            return types(List.of(types));
        }

        public CustomErrorResponse build() {
            $.rules = Objects.requireNonNull($.rules, "expected parameter 'rules' to be non-null");
            $.types = Objects.requireNonNull($.types, "expected parameter 'types' to be non-null");
            return $;
        }
    }

}
