// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v3.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.dialogflow_v3.outputs.GoogleCloudDialogflowCxV3FulfillmentConditionalCasesCaseCaseContentResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GoogleCloudDialogflowCxV3FulfillmentConditionalCasesCaseResponse {
    /**
     * A list of case content.
     * 
     */
    private final List<GoogleCloudDialogflowCxV3FulfillmentConditionalCasesCaseCaseContentResponse> caseContent;
    /**
     * The condition to activate and select this case. Empty means the condition is always true. The condition is evaluated against form parameters or session parameters. See the [conditions reference](https://cloud.google.com/dialogflow/cx/docs/reference/condition).
     * 
     */
    private final String condition;

    @CustomType.Constructor
    private GoogleCloudDialogflowCxV3FulfillmentConditionalCasesCaseResponse(
        @CustomType.Parameter("caseContent") List<GoogleCloudDialogflowCxV3FulfillmentConditionalCasesCaseCaseContentResponse> caseContent,
        @CustomType.Parameter("condition") String condition) {
        this.caseContent = caseContent;
        this.condition = condition;
    }

    /**
     * A list of case content.
     * 
    */
    public List<GoogleCloudDialogflowCxV3FulfillmentConditionalCasesCaseCaseContentResponse> caseContent() {
        return this.caseContent;
    }
    /**
     * The condition to activate and select this case. Empty means the condition is always true. The condition is evaluated against form parameters or session parameters. See the [conditions reference](https://cloud.google.com/dialogflow/cx/docs/reference/condition).
     * 
    */
    public String condition() {
        return this.condition;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3FulfillmentConditionalCasesCaseResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GoogleCloudDialogflowCxV3FulfillmentConditionalCasesCaseCaseContentResponse> caseContent;
        private String condition;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3FulfillmentConditionalCasesCaseResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.caseContent = defaults.caseContent;
    	      this.condition = defaults.condition;
        }

        public Builder caseContent(List<GoogleCloudDialogflowCxV3FulfillmentConditionalCasesCaseCaseContentResponse> caseContent) {
            this.caseContent = Objects.requireNonNull(caseContent);
            return this;
        }
        public Builder caseContent(GoogleCloudDialogflowCxV3FulfillmentConditionalCasesCaseCaseContentResponse... caseContent) {
            return caseContent(List.of(caseContent));
        }
        public Builder condition(String condition) {
            this.condition = Objects.requireNonNull(condition);
            return this;
        }        public GoogleCloudDialogflowCxV3FulfillmentConditionalCasesCaseResponse build() {
            return new GoogleCloudDialogflowCxV3FulfillmentConditionalCasesCaseResponse(caseContent, condition);
        }
    }
}
