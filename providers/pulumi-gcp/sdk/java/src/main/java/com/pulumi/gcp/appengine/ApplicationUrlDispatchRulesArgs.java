// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.appengine;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.appengine.inputs.ApplicationUrlDispatchRulesDispatchRuleArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApplicationUrlDispatchRulesArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApplicationUrlDispatchRulesArgs Empty = new ApplicationUrlDispatchRulesArgs();

    /**
     * Rules to match an HTTP request and dispatch that request to a service.
     * Structure is documented below.
     * 
     */
    @Import(name="dispatchRules", required=true)
    private Output<List<ApplicationUrlDispatchRulesDispatchRuleArgs>> dispatchRules;

    public Output<List<ApplicationUrlDispatchRulesDispatchRuleArgs>> dispatchRules() {
        return this.dispatchRules;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    private ApplicationUrlDispatchRulesArgs() {}

    private ApplicationUrlDispatchRulesArgs(ApplicationUrlDispatchRulesArgs $) {
        this.dispatchRules = $.dispatchRules;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApplicationUrlDispatchRulesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApplicationUrlDispatchRulesArgs $;

        public Builder() {
            $ = new ApplicationUrlDispatchRulesArgs();
        }

        public Builder(ApplicationUrlDispatchRulesArgs defaults) {
            $ = new ApplicationUrlDispatchRulesArgs(Objects.requireNonNull(defaults));
        }

        public Builder dispatchRules(Output<List<ApplicationUrlDispatchRulesDispatchRuleArgs>> dispatchRules) {
            $.dispatchRules = dispatchRules;
            return this;
        }

        public Builder dispatchRules(List<ApplicationUrlDispatchRulesDispatchRuleArgs> dispatchRules) {
            return dispatchRules(Output.of(dispatchRules));
        }

        public Builder dispatchRules(ApplicationUrlDispatchRulesDispatchRuleArgs... dispatchRules) {
            return dispatchRules(List.of(dispatchRules));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public ApplicationUrlDispatchRulesArgs build() {
            $.dispatchRules = Objects.requireNonNull($.dispatchRules, "expected parameter 'dispatchRules' to be non-null");
            return $;
        }
    }

}
