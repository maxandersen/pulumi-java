// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2beta1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


/**
 * Defines the Automated Agent to connect to a conversation.
 * 
 */
public final class GoogleCloudDialogflowV2beta1AutomatedAgentConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowV2beta1AutomatedAgentConfigArgs Empty = new GoogleCloudDialogflowV2beta1AutomatedAgentConfigArgs();

    /**
     * ID of the Dialogflow agent environment to use. This project needs to either be the same project as the conversation or you need to grant `service-@gcp-sa-dialogflow.iam.gserviceaccount.com` the `Dialogflow API Service Agent` role in this project. - For ES agents, use format: `projects//locations//agent/environments/`. If environment is not specified, the default `draft` environment is used. Refer to [DetectIntentRequest](/dialogflow/docs/reference/rpc/google.cloud.dialogflow.v2beta1#google.cloud.dialogflow.v2beta1.DetectIntentRequest) for more details. - For CX agents, use format `projects//locations//agents//environments/`. If environment is not specified, the default `draft` environment is used.
     * 
     */
    @Import(name="agent", required=true)
      private final Output<String> agent;

    public Output<String> agent() {
        return this.agent;
    }

    public GoogleCloudDialogflowV2beta1AutomatedAgentConfigArgs(Output<String> agent) {
        this.agent = Objects.requireNonNull(agent, "expected parameter 'agent' to be non-null");
    }

    private GoogleCloudDialogflowV2beta1AutomatedAgentConfigArgs() {
        this.agent = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2beta1AutomatedAgentConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> agent;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2beta1AutomatedAgentConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.agent = defaults.agent;
        }

        public Builder agent(Output<String> agent) {
            this.agent = Objects.requireNonNull(agent);
            return this;
        }
        public Builder agent(String agent) {
            this.agent = Output.of(Objects.requireNonNull(agent));
            return this;
        }        public GoogleCloudDialogflowV2beta1AutomatedAgentConfigArgs build() {
            return new GoogleCloudDialogflowV2beta1AutomatedAgentConfigArgs(agent);
        }
    }
}
