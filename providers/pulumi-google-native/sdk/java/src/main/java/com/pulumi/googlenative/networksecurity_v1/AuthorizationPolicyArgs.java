// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.networksecurity_v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.networksecurity_v1.enums.AuthorizationPolicyAction;
import com.pulumi.googlenative.networksecurity_v1.inputs.RuleArgs;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AuthorizationPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final AuthorizationPolicyArgs Empty = new AuthorizationPolicyArgs();

    /**
     * The action to take when a rule match is found. Possible values are &#34;ALLOW&#34; or &#34;DENY&#34;.
     * 
     */
    @Import(name="action", required=true)
      private final Output<AuthorizationPolicyAction> action;

    public Output<AuthorizationPolicyAction> action() {
        return this.action;
    }

    @Import(name="authorizationPolicyId", required=true)
      private final Output<String> authorizationPolicyId;

    public Output<String> authorizationPolicyId() {
        return this.authorizationPolicyId;
    }

    /**
     * Optional. Free-text description of the resource.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * Optional. Set of label tags associated with the AuthorizationPolicy resource.
     * 
     */
    @Import(name="labels")
      private final @Nullable Output<Map<String,String>> labels;

    public Output<Map<String,String>> labels() {
        return this.labels == null ? Codegen.empty() : this.labels;
    }

    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> location() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    /**
     * Name of the AuthorizationPolicy resource. It matches pattern `projects/{project}/locations/{location}/authorizationPolicies/`.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> project() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    /**
     * Optional. List of rules to match. Note that at least one of the rules must match in order for the action specified in the &#39;action&#39; field to be taken. A rule is a match if there is a matching source and destination. If left blank, the action specified in the `action` field will be applied on every request.
     * 
     */
    @Import(name="rules")
      private final @Nullable Output<List<RuleArgs>> rules;

    public Output<List<RuleArgs>> rules() {
        return this.rules == null ? Codegen.empty() : this.rules;
    }

    public AuthorizationPolicyArgs(
        Output<AuthorizationPolicyAction> action,
        Output<String> authorizationPolicyId,
        @Nullable Output<String> description,
        @Nullable Output<Map<String,String>> labels,
        @Nullable Output<String> location,
        @Nullable Output<String> name,
        @Nullable Output<String> project,
        @Nullable Output<List<RuleArgs>> rules) {
        this.action = Objects.requireNonNull(action, "expected parameter 'action' to be non-null");
        this.authorizationPolicyId = Objects.requireNonNull(authorizationPolicyId, "expected parameter 'authorizationPolicyId' to be non-null");
        this.description = description;
        this.labels = labels;
        this.location = location;
        this.name = name;
        this.project = project;
        this.rules = rules;
    }

    private AuthorizationPolicyArgs() {
        this.action = Codegen.empty();
        this.authorizationPolicyId = Codegen.empty();
        this.description = Codegen.empty();
        this.labels = Codegen.empty();
        this.location = Codegen.empty();
        this.name = Codegen.empty();
        this.project = Codegen.empty();
        this.rules = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AuthorizationPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<AuthorizationPolicyAction> action;
        private Output<String> authorizationPolicyId;
        private @Nullable Output<String> description;
        private @Nullable Output<Map<String,String>> labels;
        private @Nullable Output<String> location;
        private @Nullable Output<String> name;
        private @Nullable Output<String> project;
        private @Nullable Output<List<RuleArgs>> rules;

        public Builder() {
    	      // Empty
        }

        public Builder(AuthorizationPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.authorizationPolicyId = defaults.authorizationPolicyId;
    	      this.description = defaults.description;
    	      this.labels = defaults.labels;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.rules = defaults.rules;
        }

        public Builder action(Output<AuthorizationPolicyAction> action) {
            this.action = Objects.requireNonNull(action);
            return this;
        }
        public Builder action(AuthorizationPolicyAction action) {
            this.action = Output.of(Objects.requireNonNull(action));
            return this;
        }
        public Builder authorizationPolicyId(Output<String> authorizationPolicyId) {
            this.authorizationPolicyId = Objects.requireNonNull(authorizationPolicyId);
            return this;
        }
        public Builder authorizationPolicyId(String authorizationPolicyId) {
            this.authorizationPolicyId = Output.of(Objects.requireNonNull(authorizationPolicyId));
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
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }
        public Builder labels(@Nullable Map<String,String> labels) {
            this.labels = Codegen.ofNullable(labels);
            return this;
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Codegen.ofNullable(location);
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
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }
        public Builder rules(@Nullable Output<List<RuleArgs>> rules) {
            this.rules = rules;
            return this;
        }
        public Builder rules(@Nullable List<RuleArgs> rules) {
            this.rules = Codegen.ofNullable(rules);
            return this;
        }
        public Builder rules(RuleArgs... rules) {
            return rules(List.of(rules));
        }        public AuthorizationPolicyArgs build() {
            return new AuthorizationPolicyArgs(action, authorizationPolicyId, description, labels, location, name, project, rules);
        }
    }
}
