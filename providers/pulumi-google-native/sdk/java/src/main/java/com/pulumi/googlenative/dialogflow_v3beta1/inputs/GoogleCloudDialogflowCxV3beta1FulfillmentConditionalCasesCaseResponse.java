// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v3beta1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dialogflow_v3beta1.inputs.GoogleCloudDialogflowCxV3beta1FulfillmentConditionalCasesCaseCaseContentResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Each case has a Boolean condition. When it is evaluated to be True, the corresponding messages will be selected and evaluated recursively.
 * 
 */
public final class GoogleCloudDialogflowCxV3beta1FulfillmentConditionalCasesCaseResponse extends com.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDialogflowCxV3beta1FulfillmentConditionalCasesCaseResponse Empty = new GoogleCloudDialogflowCxV3beta1FulfillmentConditionalCasesCaseResponse();

    /**
     * A list of case content.
     * 
     */
    @Import(name="caseContent", required=true)
      private final List<GoogleCloudDialogflowCxV3beta1FulfillmentConditionalCasesCaseCaseContentResponse> caseContent;

    public List<GoogleCloudDialogflowCxV3beta1FulfillmentConditionalCasesCaseCaseContentResponse> caseContent() {
        return this.caseContent;
    }

    /**
     * The condition to activate and select this case. Empty means the condition is always true. The condition is evaluated against form parameters or session parameters. See the [conditions reference](https://cloud.google.com/dialogflow/cx/docs/reference/condition).
     * 
     */
    @Import(name="condition", required=true)
      private final String condition;

    public String condition() {
        return this.condition;
    }

    public GoogleCloudDialogflowCxV3beta1FulfillmentConditionalCasesCaseResponse(
        List<GoogleCloudDialogflowCxV3beta1FulfillmentConditionalCasesCaseCaseContentResponse> caseContent,
        String condition) {
        this.caseContent = Objects.requireNonNull(caseContent, "expected parameter 'caseContent' to be non-null");
        this.condition = Objects.requireNonNull(condition, "expected parameter 'condition' to be non-null");
    }

    private GoogleCloudDialogflowCxV3beta1FulfillmentConditionalCasesCaseResponse() {
        this.caseContent = List.of();
        this.condition = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3beta1FulfillmentConditionalCasesCaseResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GoogleCloudDialogflowCxV3beta1FulfillmentConditionalCasesCaseCaseContentResponse> caseContent;
        private String condition;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3beta1FulfillmentConditionalCasesCaseResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.caseContent = defaults.caseContent;
    	      this.condition = defaults.condition;
        }

        public Builder caseContent(List<GoogleCloudDialogflowCxV3beta1FulfillmentConditionalCasesCaseCaseContentResponse> caseContent) {
            this.caseContent = Objects.requireNonNull(caseContent);
            return this;
        }
        public Builder caseContent(GoogleCloudDialogflowCxV3beta1FulfillmentConditionalCasesCaseCaseContentResponse... caseContent) {
            return caseContent(List.of(caseContent));
        }
        public Builder condition(String condition) {
            this.condition = Objects.requireNonNull(condition);
            return this;
        }        public GoogleCloudDialogflowCxV3beta1FulfillmentConditionalCasesCaseResponse build() {
            return new GoogleCloudDialogflowCxV3beta1FulfillmentConditionalCasesCaseResponse(caseContent, condition);
        }
    }
}
