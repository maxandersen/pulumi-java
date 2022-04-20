// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ListWebAppSitePushSettingsResult {
    /**
     * Gets or sets a JSON string containing a list of dynamic tags that will be evaluated from user claims in the push registration endpoint.
     * 
     */
    private final @Nullable String dynamicTagsJson;
    /**
     * Resource Id.
     * 
     */
    private final String id;
    /**
     * Gets or sets a flag indicating whether the Push endpoint is enabled.
     * 
     */
    private final Boolean isPushEnabled;
    /**
     * Kind of resource.
     * 
     */
    private final @Nullable String kind;
    /**
     * Resource Name.
     * 
     */
    private final String name;
    /**
     * Gets or sets a JSON string containing a list of tags that are whitelisted for use by the push registration endpoint.
     * 
     */
    private final @Nullable String tagWhitelistJson;
    /**
     * Gets or sets a JSON string containing a list of tags that require user authentication to be used in the push registration endpoint.
     * Tags can consist of alphanumeric characters and the following:
     * &#39;_&#39;, &#39;@&#39;, &#39;#&#39;, &#39;.&#39;, &#39;:&#39;, &#39;-&#39;.
     * Validation should be performed at the PushRequestHandler.
     * 
     */
    private final @Nullable String tagsRequiringAuth;
    /**
     * Resource type.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private ListWebAppSitePushSettingsResult(
        @CustomType.Parameter("dynamicTagsJson") @Nullable String dynamicTagsJson,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("isPushEnabled") Boolean isPushEnabled,
        @CustomType.Parameter("kind") @Nullable String kind,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("tagWhitelistJson") @Nullable String tagWhitelistJson,
        @CustomType.Parameter("tagsRequiringAuth") @Nullable String tagsRequiringAuth,
        @CustomType.Parameter("type") String type) {
        this.dynamicTagsJson = dynamicTagsJson;
        this.id = id;
        this.isPushEnabled = isPushEnabled;
        this.kind = kind;
        this.name = name;
        this.tagWhitelistJson = tagWhitelistJson;
        this.tagsRequiringAuth = tagsRequiringAuth;
        this.type = type;
    }

    /**
     * Gets or sets a JSON string containing a list of dynamic tags that will be evaluated from user claims in the push registration endpoint.
     * 
    */
    public Optional<String> dynamicTagsJson() {
        return Optional.ofNullable(this.dynamicTagsJson);
    }
    /**
     * Resource Id.
     * 
    */
    public String id() {
        return this.id;
    }
    /**
     * Gets or sets a flag indicating whether the Push endpoint is enabled.
     * 
    */
    public Boolean isPushEnabled() {
        return this.isPushEnabled;
    }
    /**
     * Kind of resource.
     * 
    */
    public Optional<String> kind() {
        return Optional.ofNullable(this.kind);
    }
    /**
     * Resource Name.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * Gets or sets a JSON string containing a list of tags that are whitelisted for use by the push registration endpoint.
     * 
    */
    public Optional<String> tagWhitelistJson() {
        return Optional.ofNullable(this.tagWhitelistJson);
    }
    /**
     * Gets or sets a JSON string containing a list of tags that require user authentication to be used in the push registration endpoint.
     * Tags can consist of alphanumeric characters and the following:
     * &#39;_&#39;, &#39;@&#39;, &#39;#&#39;, &#39;.&#39;, &#39;:&#39;, &#39;-&#39;.
     * Validation should be performed at the PushRequestHandler.
     * 
    */
    public Optional<String> tagsRequiringAuth() {
        return Optional.ofNullable(this.tagsRequiringAuth);
    }
    /**
     * Resource type.
     * 
    */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListWebAppSitePushSettingsResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String dynamicTagsJson;
        private String id;
        private Boolean isPushEnabled;
        private @Nullable String kind;
        private String name;
        private @Nullable String tagWhitelistJson;
        private @Nullable String tagsRequiringAuth;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ListWebAppSitePushSettingsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dynamicTagsJson = defaults.dynamicTagsJson;
    	      this.id = defaults.id;
    	      this.isPushEnabled = defaults.isPushEnabled;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.tagWhitelistJson = defaults.tagWhitelistJson;
    	      this.tagsRequiringAuth = defaults.tagsRequiringAuth;
    	      this.type = defaults.type;
        }

        public Builder dynamicTagsJson(@Nullable String dynamicTagsJson) {
            this.dynamicTagsJson = dynamicTagsJson;
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder isPushEnabled(Boolean isPushEnabled) {
            this.isPushEnabled = Objects.requireNonNull(isPushEnabled);
            return this;
        }
        public Builder kind(@Nullable String kind) {
            this.kind = kind;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder tagWhitelistJson(@Nullable String tagWhitelistJson) {
            this.tagWhitelistJson = tagWhitelistJson;
            return this;
        }
        public Builder tagsRequiringAuth(@Nullable String tagsRequiringAuth) {
            this.tagsRequiringAuth = tagsRequiringAuth;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public ListWebAppSitePushSettingsResult build() {
            return new ListWebAppSitePushSettingsResult(dynamicTagsJson, id, isPushEnabled, kind, name, tagWhitelistJson, tagsRequiringAuth, type);
        }
    }
}
