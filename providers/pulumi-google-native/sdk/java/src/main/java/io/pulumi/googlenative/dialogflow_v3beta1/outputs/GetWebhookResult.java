// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3beta1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.dialogflow_v3beta1.outputs.GoogleCloudDialogflowCxV3beta1WebhookGenericWebServiceResponse;
import io.pulumi.googlenative.dialogflow_v3beta1.outputs.GoogleCloudDialogflowCxV3beta1WebhookServiceDirectoryConfigResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetWebhookResult {
    /**
     * Indicates whether the webhook is disabled.
     * 
     */
    private final Boolean disabled;
    /**
     * The human-readable name of the webhook, unique within the agent.
     * 
     */
    private final String displayName;
    /**
     * Configuration for a generic web service.
     * 
     */
    private final GoogleCloudDialogflowCxV3beta1WebhookGenericWebServiceResponse genericWebService;
    /**
     * The unique identifier of the webhook. Required for the Webhooks.UpdateWebhook method. Webhooks.CreateWebhook populates the name automatically. Format: `projects//locations//agents//webhooks/`.
     * 
     */
    private final String name;
    /**
     * Configuration for a [Service Directory](https://cloud.google.com/service-directory) service.
     * 
     */
    private final GoogleCloudDialogflowCxV3beta1WebhookServiceDirectoryConfigResponse serviceDirectory;
    /**
     * Webhook execution timeout. Execution is considered failed if Dialogflow doesn't receive a response from webhook at the end of the timeout period. Defaults to 5 seconds, maximum allowed timeout is 30 seconds.
     * 
     */
    private final String timeout;

    @CustomType.Constructor
    private GetWebhookResult(
        @CustomType.Parameter("disabled") Boolean disabled,
        @CustomType.Parameter("displayName") String displayName,
        @CustomType.Parameter("genericWebService") GoogleCloudDialogflowCxV3beta1WebhookGenericWebServiceResponse genericWebService,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("serviceDirectory") GoogleCloudDialogflowCxV3beta1WebhookServiceDirectoryConfigResponse serviceDirectory,
        @CustomType.Parameter("timeout") String timeout) {
        this.disabled = disabled;
        this.displayName = displayName;
        this.genericWebService = genericWebService;
        this.name = name;
        this.serviceDirectory = serviceDirectory;
        this.timeout = timeout;
    }

    /**
     * Indicates whether the webhook is disabled.
     * 
    */
    public Boolean disabled() {
        return this.disabled;
    }
    /**
     * The human-readable name of the webhook, unique within the agent.
     * 
    */
    public String displayName() {
        return this.displayName;
    }
    /**
     * Configuration for a generic web service.
     * 
    */
    public GoogleCloudDialogflowCxV3beta1WebhookGenericWebServiceResponse genericWebService() {
        return this.genericWebService;
    }
    /**
     * The unique identifier of the webhook. Required for the Webhooks.UpdateWebhook method. Webhooks.CreateWebhook populates the name automatically. Format: `projects//locations//agents//webhooks/`.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * Configuration for a [Service Directory](https://cloud.google.com/service-directory) service.
     * 
    */
    public GoogleCloudDialogflowCxV3beta1WebhookServiceDirectoryConfigResponse serviceDirectory() {
        return this.serviceDirectory;
    }
    /**
     * Webhook execution timeout. Execution is considered failed if Dialogflow doesn't receive a response from webhook at the end of the timeout period. Defaults to 5 seconds, maximum allowed timeout is 30 seconds.
     * 
    */
    public String timeout() {
        return this.timeout;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWebhookResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean disabled;
        private String displayName;
        private GoogleCloudDialogflowCxV3beta1WebhookGenericWebServiceResponse genericWebService;
        private String name;
        private GoogleCloudDialogflowCxV3beta1WebhookServiceDirectoryConfigResponse serviceDirectory;
        private String timeout;

        public Builder() {
    	      // Empty
        }

        public Builder(GetWebhookResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disabled = defaults.disabled;
    	      this.displayName = defaults.displayName;
    	      this.genericWebService = defaults.genericWebService;
    	      this.name = defaults.name;
    	      this.serviceDirectory = defaults.serviceDirectory;
    	      this.timeout = defaults.timeout;
        }

        public Builder disabled(Boolean disabled) {
            this.disabled = Objects.requireNonNull(disabled);
            return this;
        }
        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        public Builder genericWebService(GoogleCloudDialogflowCxV3beta1WebhookGenericWebServiceResponse genericWebService) {
            this.genericWebService = Objects.requireNonNull(genericWebService);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder serviceDirectory(GoogleCloudDialogflowCxV3beta1WebhookServiceDirectoryConfigResponse serviceDirectory) {
            this.serviceDirectory = Objects.requireNonNull(serviceDirectory);
            return this;
        }
        public Builder timeout(String timeout) {
            this.timeout = Objects.requireNonNull(timeout);
            return this;
        }        public GetWebhookResult build() {
            return new GetWebhookResult(disabled, displayName, genericWebService, name, serviceDirectory, timeout);
        }
    }
}
