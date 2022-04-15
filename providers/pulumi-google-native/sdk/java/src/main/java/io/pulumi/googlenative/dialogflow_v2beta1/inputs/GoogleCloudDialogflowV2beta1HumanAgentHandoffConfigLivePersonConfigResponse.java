// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2beta1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Configuration specific to LivePerson (https://www.liveperson.com).
 * 
 */
public final class GoogleCloudDialogflowV2beta1HumanAgentHandoffConfigLivePersonConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDialogflowV2beta1HumanAgentHandoffConfigLivePersonConfigResponse Empty = new GoogleCloudDialogflowV2beta1HumanAgentHandoffConfigLivePersonConfigResponse();

    /**
     * Account number of the LivePerson account to connect. This is the account number you input at the login page.
     * 
     */
    @Import(name="accountNumber", required=true)
      private final String accountNumber;

    public String accountNumber() {
        return this.accountNumber;
    }

    public GoogleCloudDialogflowV2beta1HumanAgentHandoffConfigLivePersonConfigResponse(String accountNumber) {
        this.accountNumber = Objects.requireNonNull(accountNumber, "expected parameter 'accountNumber' to be non-null");
    }

    private GoogleCloudDialogflowV2beta1HumanAgentHandoffConfigLivePersonConfigResponse() {
        this.accountNumber = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2beta1HumanAgentHandoffConfigLivePersonConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String accountNumber;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2beta1HumanAgentHandoffConfigLivePersonConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountNumber = defaults.accountNumber;
        }

        public Builder accountNumber(String accountNumber) {
            this.accountNumber = Objects.requireNonNull(accountNumber);
            return this;
        }        public GoogleCloudDialogflowV2beta1HumanAgentHandoffConfigLivePersonConfigResponse build() {
            return new GoogleCloudDialogflowV2beta1HumanAgentHandoffConfigLivePersonConfigResponse(accountNumber);
        }
    }
}
