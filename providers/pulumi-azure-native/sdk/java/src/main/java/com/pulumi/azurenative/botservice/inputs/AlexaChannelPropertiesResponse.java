// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.botservice.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


/**
 * The parameters to provide for the Alexa channel.
 * 
 */
public final class AlexaChannelPropertiesResponse extends com.pulumi.resources.InvokeArgs {

    public static final AlexaChannelPropertiesResponse Empty = new AlexaChannelPropertiesResponse();

    /**
     * The Alexa skill Id
     * 
     */
    @Import(name="alexaSkillId", required=true)
      private final String alexaSkillId;

    public String alexaSkillId() {
        return this.alexaSkillId;
    }

    /**
     * Whether this channel is enabled for the bot
     * 
     */
    @Import(name="isEnabled", required=true)
      private final Boolean isEnabled;

    public Boolean isEnabled() {
        return this.isEnabled;
    }

    /**
     * Full Uri used to configured the skill in Alexa
     * 
     */
    @Import(name="serviceEndpointUri", required=true)
      private final String serviceEndpointUri;

    public String serviceEndpointUri() {
        return this.serviceEndpointUri;
    }

    /**
     * Url fragment used in part of the Uri configured in Alexa
     * 
     */
    @Import(name="urlFragment", required=true)
      private final String urlFragment;

    public String urlFragment() {
        return this.urlFragment;
    }

    public AlexaChannelPropertiesResponse(
        String alexaSkillId,
        Boolean isEnabled,
        String serviceEndpointUri,
        String urlFragment) {
        this.alexaSkillId = Objects.requireNonNull(alexaSkillId, "expected parameter 'alexaSkillId' to be non-null");
        this.isEnabled = Objects.requireNonNull(isEnabled, "expected parameter 'isEnabled' to be non-null");
        this.serviceEndpointUri = Objects.requireNonNull(serviceEndpointUri, "expected parameter 'serviceEndpointUri' to be non-null");
        this.urlFragment = Objects.requireNonNull(urlFragment, "expected parameter 'urlFragment' to be non-null");
    }

    private AlexaChannelPropertiesResponse() {
        this.alexaSkillId = null;
        this.isEnabled = null;
        this.serviceEndpointUri = null;
        this.urlFragment = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AlexaChannelPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String alexaSkillId;
        private Boolean isEnabled;
        private String serviceEndpointUri;
        private String urlFragment;

        public Builder() {
    	      // Empty
        }

        public Builder(AlexaChannelPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alexaSkillId = defaults.alexaSkillId;
    	      this.isEnabled = defaults.isEnabled;
    	      this.serviceEndpointUri = defaults.serviceEndpointUri;
    	      this.urlFragment = defaults.urlFragment;
        }

        public Builder alexaSkillId(String alexaSkillId) {
            this.alexaSkillId = Objects.requireNonNull(alexaSkillId);
            return this;
        }
        public Builder isEnabled(Boolean isEnabled) {
            this.isEnabled = Objects.requireNonNull(isEnabled);
            return this;
        }
        public Builder serviceEndpointUri(String serviceEndpointUri) {
            this.serviceEndpointUri = Objects.requireNonNull(serviceEndpointUri);
            return this;
        }
        public Builder urlFragment(String urlFragment) {
            this.urlFragment = Objects.requireNonNull(urlFragment);
            return this;
        }        public AlexaChannelPropertiesResponse build() {
            return new AlexaChannelPropertiesResponse(alexaSkillId, isEnabled, serviceEndpointUri, urlFragment);
        }
    }
}
