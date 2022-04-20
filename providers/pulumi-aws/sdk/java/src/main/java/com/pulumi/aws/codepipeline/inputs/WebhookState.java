// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.codepipeline.inputs;

import com.pulumi.aws.codepipeline.inputs.WebhookAuthenticationConfigurationGetArgs;
import com.pulumi.aws.codepipeline.inputs.WebhookFilterGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebhookState extends com.pulumi.resources.ResourceArgs {

    public static final WebhookState Empty = new WebhookState();

    /**
     * The CodePipeline webhook&#39;s ARN.
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> arn() {
        return this.arn == null ? Codegen.empty() : this.arn;
    }

    /**
     * The type of authentication  to use. One of `IP`, `GITHUB_HMAC`, or `UNAUTHENTICATED`.
     * 
     */
    @Import(name="authentication")
      private final @Nullable Output<String> authentication;

    public Output<String> authentication() {
        return this.authentication == null ? Codegen.empty() : this.authentication;
    }

    /**
     * An `auth` block. Required for `IP` and `GITHUB_HMAC`. Auth blocks are documented below.
     * 
     */
    @Import(name="authenticationConfiguration")
      private final @Nullable Output<WebhookAuthenticationConfigurationGetArgs> authenticationConfiguration;

    public Output<WebhookAuthenticationConfigurationGetArgs> authenticationConfiguration() {
        return this.authenticationConfiguration == null ? Codegen.empty() : this.authenticationConfiguration;
    }

    /**
     * One or more `filter` blocks. Filter blocks are documented below.
     * 
     */
    @Import(name="filters")
      private final @Nullable Output<List<WebhookFilterGetArgs>> filters;

    public Output<List<WebhookFilterGetArgs>> filters() {
        return this.filters == null ? Codegen.empty() : this.filters;
    }

    /**
     * The name of the webhook.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @Import(name="tagsAll")
      private final @Nullable Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll == null ? Codegen.empty() : this.tagsAll;
    }

    /**
     * The name of the action in a pipeline you want to connect to the webhook. The action must be from the source (first) stage of the pipeline.
     * 
     */
    @Import(name="targetAction")
      private final @Nullable Output<String> targetAction;

    public Output<String> targetAction() {
        return this.targetAction == null ? Codegen.empty() : this.targetAction;
    }

    /**
     * The name of the pipeline.
     * 
     */
    @Import(name="targetPipeline")
      private final @Nullable Output<String> targetPipeline;

    public Output<String> targetPipeline() {
        return this.targetPipeline == null ? Codegen.empty() : this.targetPipeline;
    }

    /**
     * The CodePipeline webhook&#39;s URL. POST events to this endpoint to trigger the target.
     * 
     */
    @Import(name="url")
      private final @Nullable Output<String> url;

    public Output<String> url() {
        return this.url == null ? Codegen.empty() : this.url;
    }

    public WebhookState(
        @Nullable Output<String> arn,
        @Nullable Output<String> authentication,
        @Nullable Output<WebhookAuthenticationConfigurationGetArgs> authenticationConfiguration,
        @Nullable Output<List<WebhookFilterGetArgs>> filters,
        @Nullable Output<String> name,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Map<String,String>> tagsAll,
        @Nullable Output<String> targetAction,
        @Nullable Output<String> targetPipeline,
        @Nullable Output<String> url) {
        this.arn = arn;
        this.authentication = authentication;
        this.authenticationConfiguration = authenticationConfiguration;
        this.filters = filters;
        this.name = name;
        this.tags = tags;
        this.tagsAll = tagsAll;
        this.targetAction = targetAction;
        this.targetPipeline = targetPipeline;
        this.url = url;
    }

    private WebhookState() {
        this.arn = Codegen.empty();
        this.authentication = Codegen.empty();
        this.authenticationConfiguration = Codegen.empty();
        this.filters = Codegen.empty();
        this.name = Codegen.empty();
        this.tags = Codegen.empty();
        this.tagsAll = Codegen.empty();
        this.targetAction = Codegen.empty();
        this.targetPipeline = Codegen.empty();
        this.url = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebhookState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> arn;
        private @Nullable Output<String> authentication;
        private @Nullable Output<WebhookAuthenticationConfigurationGetArgs> authenticationConfiguration;
        private @Nullable Output<List<WebhookFilterGetArgs>> filters;
        private @Nullable Output<String> name;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Map<String,String>> tagsAll;
        private @Nullable Output<String> targetAction;
        private @Nullable Output<String> targetPipeline;
        private @Nullable Output<String> url;

        public Builder() {
    	      // Empty
        }

        public Builder(WebhookState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.authentication = defaults.authentication;
    	      this.authenticationConfiguration = defaults.authenticationConfiguration;
    	      this.filters = defaults.filters;
    	      this.name = defaults.name;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
    	      this.targetAction = defaults.targetAction;
    	      this.targetPipeline = defaults.targetPipeline;
    	      this.url = defaults.url;
        }

        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }
        public Builder arn(@Nullable String arn) {
            this.arn = Codegen.ofNullable(arn);
            return this;
        }
        public Builder authentication(@Nullable Output<String> authentication) {
            this.authentication = authentication;
            return this;
        }
        public Builder authentication(@Nullable String authentication) {
            this.authentication = Codegen.ofNullable(authentication);
            return this;
        }
        public Builder authenticationConfiguration(@Nullable Output<WebhookAuthenticationConfigurationGetArgs> authenticationConfiguration) {
            this.authenticationConfiguration = authenticationConfiguration;
            return this;
        }
        public Builder authenticationConfiguration(@Nullable WebhookAuthenticationConfigurationGetArgs authenticationConfiguration) {
            this.authenticationConfiguration = Codegen.ofNullable(authenticationConfiguration);
            return this;
        }
        public Builder filters(@Nullable Output<List<WebhookFilterGetArgs>> filters) {
            this.filters = filters;
            return this;
        }
        public Builder filters(@Nullable List<WebhookFilterGetArgs> filters) {
            this.filters = Codegen.ofNullable(filters);
            return this;
        }
        public Builder filters(WebhookFilterGetArgs... filters) {
            return filters(List.of(filters));
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }
        public Builder tagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Codegen.ofNullable(tagsAll);
            return this;
        }
        public Builder targetAction(@Nullable Output<String> targetAction) {
            this.targetAction = targetAction;
            return this;
        }
        public Builder targetAction(@Nullable String targetAction) {
            this.targetAction = Codegen.ofNullable(targetAction);
            return this;
        }
        public Builder targetPipeline(@Nullable Output<String> targetPipeline) {
            this.targetPipeline = targetPipeline;
            return this;
        }
        public Builder targetPipeline(@Nullable String targetPipeline) {
            this.targetPipeline = Codegen.ofNullable(targetPipeline);
            return this;
        }
        public Builder url(@Nullable Output<String> url) {
            this.url = url;
            return this;
        }
        public Builder url(@Nullable String url) {
            this.url = Codegen.ofNullable(url);
            return this;
        }        public WebhookState build() {
            return new WebhookState(arn, authentication, authenticationConfiguration, filters, name, tags, tagsAll, targetAction, targetPipeline, url);
        }
    }
}
