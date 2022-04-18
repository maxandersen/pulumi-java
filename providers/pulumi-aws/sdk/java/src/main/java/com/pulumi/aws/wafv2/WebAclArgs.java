// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2;

import com.pulumi.aws.wafv2.inputs.WebAclCustomResponseBodyArgs;
import com.pulumi.aws.wafv2.inputs.WebAclDefaultActionArgs;
import com.pulumi.aws.wafv2.inputs.WebAclRuleArgs;
import com.pulumi.aws.wafv2.inputs.WebAclVisibilityConfigArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebAclArgs extends com.pulumi.resources.ResourceArgs {

    public static final WebAclArgs Empty = new WebAclArgs();

    /**
     * Defines custom response bodies that can be referenced by `custom_response` actions. See Custom Response Body below for details.
     * 
     */
    @Import(name="customResponseBodies")
      private final @Nullable Output<List<WebAclCustomResponseBodyArgs>> customResponseBodies;

    public Output<List<WebAclCustomResponseBodyArgs>> customResponseBodies() {
        return this.customResponseBodies == null ? Codegen.empty() : this.customResponseBodies;
    }

    /**
     * The action to perform if none of the `rules` contained in the WebACL match. See Default Action below for details.
     * 
     */
    @Import(name="defaultAction", required=true)
      private final Output<WebAclDefaultActionArgs> defaultAction;

    public Output<WebAclDefaultActionArgs> defaultAction() {
        return this.defaultAction;
    }

    /**
     * A friendly description of the WebACL.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * The label string.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * The rule blocks used to identify the web requests that you want to `allow`, `block`, or `count`. See Rules below for details.
     * 
     */
    @Import(name="rules")
      private final @Nullable Output<List<WebAclRuleArgs>> rules;

    public Output<List<WebAclRuleArgs>> rules() {
        return this.rules == null ? Codegen.empty() : this.rules;
    }

    /**
     * Specifies whether this is for an AWS CloudFront distribution or for a regional application. Valid values are `CLOUDFRONT` or `REGIONAL`. To work with CloudFront, you must also specify the region `us-east-1` (N. Virginia) on the AWS provider.
     * 
     */
    @Import(name="scope", required=true)
      private final Output<String> scope;

    public Output<String> scope() {
        return this.scope;
    }

    /**
     * An map of key:value pairs to associate with the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
     * Defines and enables Amazon CloudWatch metrics and web request sample collection. See Visibility Configuration below for details.
     * 
     */
    @Import(name="visibilityConfig", required=true)
      private final Output<WebAclVisibilityConfigArgs> visibilityConfig;

    public Output<WebAclVisibilityConfigArgs> visibilityConfig() {
        return this.visibilityConfig;
    }

    public WebAclArgs(
        @Nullable Output<List<WebAclCustomResponseBodyArgs>> customResponseBodies,
        Output<WebAclDefaultActionArgs> defaultAction,
        @Nullable Output<String> description,
        @Nullable Output<String> name,
        @Nullable Output<List<WebAclRuleArgs>> rules,
        Output<String> scope,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Map<String,String>> tagsAll,
        Output<WebAclVisibilityConfigArgs> visibilityConfig) {
        this.customResponseBodies = customResponseBodies;
        this.defaultAction = Objects.requireNonNull(defaultAction, "expected parameter 'defaultAction' to be non-null");
        this.description = description;
        this.name = name;
        this.rules = rules;
        this.scope = Objects.requireNonNull(scope, "expected parameter 'scope' to be non-null");
        this.tags = tags;
        this.tagsAll = tagsAll;
        this.visibilityConfig = Objects.requireNonNull(visibilityConfig, "expected parameter 'visibilityConfig' to be non-null");
    }

    private WebAclArgs() {
        this.customResponseBodies = Codegen.empty();
        this.defaultAction = Codegen.empty();
        this.description = Codegen.empty();
        this.name = Codegen.empty();
        this.rules = Codegen.empty();
        this.scope = Codegen.empty();
        this.tags = Codegen.empty();
        this.tagsAll = Codegen.empty();
        this.visibilityConfig = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<WebAclCustomResponseBodyArgs>> customResponseBodies;
        private Output<WebAclDefaultActionArgs> defaultAction;
        private @Nullable Output<String> description;
        private @Nullable Output<String> name;
        private @Nullable Output<List<WebAclRuleArgs>> rules;
        private Output<String> scope;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Map<String,String>> tagsAll;
        private Output<WebAclVisibilityConfigArgs> visibilityConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customResponseBodies = defaults.customResponseBodies;
    	      this.defaultAction = defaults.defaultAction;
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.rules = defaults.rules;
    	      this.scope = defaults.scope;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
    	      this.visibilityConfig = defaults.visibilityConfig;
        }

        public Builder customResponseBodies(@Nullable Output<List<WebAclCustomResponseBodyArgs>> customResponseBodies) {
            this.customResponseBodies = customResponseBodies;
            return this;
        }
        public Builder customResponseBodies(@Nullable List<WebAclCustomResponseBodyArgs> customResponseBodies) {
            this.customResponseBodies = Codegen.ofNullable(customResponseBodies);
            return this;
        }
        public Builder customResponseBodies(WebAclCustomResponseBodyArgs... customResponseBodies) {
            return customResponseBodies(List.of(customResponseBodies));
        }
        public Builder defaultAction(Output<WebAclDefaultActionArgs> defaultAction) {
            this.defaultAction = Objects.requireNonNull(defaultAction);
            return this;
        }
        public Builder defaultAction(WebAclDefaultActionArgs defaultAction) {
            this.defaultAction = Output.of(Objects.requireNonNull(defaultAction));
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder rules(@Nullable Output<List<WebAclRuleArgs>> rules) {
            this.rules = rules;
            return this;
        }
        public Builder rules(@Nullable List<WebAclRuleArgs> rules) {
            this.rules = Codegen.ofNullable(rules);
            return this;
        }
        public Builder rules(WebAclRuleArgs... rules) {
            return rules(List.of(rules));
        }
        public Builder scope(Output<String> scope) {
            this.scope = Objects.requireNonNull(scope);
            return this;
        }
        public Builder scope(String scope) {
            this.scope = Output.of(Objects.requireNonNull(scope));
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
        public Builder visibilityConfig(Output<WebAclVisibilityConfigArgs> visibilityConfig) {
            this.visibilityConfig = Objects.requireNonNull(visibilityConfig);
            return this;
        }
        public Builder visibilityConfig(WebAclVisibilityConfigArgs visibilityConfig) {
            this.visibilityConfig = Output.of(Objects.requireNonNull(visibilityConfig));
            return this;
        }        public WebAclArgs build() {
            return new WebAclArgs(customResponseBodies, defaultAction, description, name, rules, scope, tags, tagsAll, visibilityConfig);
        }
    }
}
