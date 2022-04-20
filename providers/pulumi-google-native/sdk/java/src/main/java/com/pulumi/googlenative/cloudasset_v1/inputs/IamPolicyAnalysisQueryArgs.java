// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudasset_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.cloudasset_v1.inputs.AccessSelectorArgs;
import com.pulumi.googlenative.cloudasset_v1.inputs.ConditionContextArgs;
import com.pulumi.googlenative.cloudasset_v1.inputs.IdentitySelectorArgs;
import com.pulumi.googlenative.cloudasset_v1.inputs.OptionsArgs;
import com.pulumi.googlenative.cloudasset_v1.inputs.ResourceSelectorArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * IAM policy analysis query message.
 * 
 */
public final class IamPolicyAnalysisQueryArgs extends com.pulumi.resources.ResourceArgs {

    public static final IamPolicyAnalysisQueryArgs Empty = new IamPolicyAnalysisQueryArgs();

    /**
     * Optional. Specifies roles or permissions for analysis. This is optional.
     * 
     */
    @Import(name="accessSelector")
      private final @Nullable Output<AccessSelectorArgs> accessSelector;

    public Output<AccessSelectorArgs> accessSelector() {
        return this.accessSelector == null ? Codegen.empty() : this.accessSelector;
    }

    /**
     * Optional. The hypothetical context for IAM conditions evaluation.
     * 
     */
    @Import(name="conditionContext")
      private final @Nullable Output<ConditionContextArgs> conditionContext;

    public Output<ConditionContextArgs> conditionContext() {
        return this.conditionContext == null ? Codegen.empty() : this.conditionContext;
    }

    /**
     * Optional. Specifies an identity for analysis.
     * 
     */
    @Import(name="identitySelector")
      private final @Nullable Output<IdentitySelectorArgs> identitySelector;

    public Output<IdentitySelectorArgs> identitySelector() {
        return this.identitySelector == null ? Codegen.empty() : this.identitySelector;
    }

    /**
     * Optional. The query options.
     * 
     */
    @Import(name="options")
      private final @Nullable Output<OptionsArgs> options;

    public Output<OptionsArgs> options() {
        return this.options == null ? Codegen.empty() : this.options;
    }

    /**
     * Optional. Specifies a resource for analysis.
     * 
     */
    @Import(name="resourceSelector")
      private final @Nullable Output<ResourceSelectorArgs> resourceSelector;

    public Output<ResourceSelectorArgs> resourceSelector() {
        return this.resourceSelector == null ? Codegen.empty() : this.resourceSelector;
    }

    /**
     * The relative name of the root asset. Only resources and IAM policies within the scope will be analyzed. This can only be an organization number (such as &#34;organizations/123&#34;), a folder number (such as &#34;folders/123&#34;), a project ID (such as &#34;projects/my-project-id&#34;), or a project number (such as &#34;projects/12345&#34;). To know how to get organization id, visit [here ](https://cloud.google.com/resource-manager/docs/creating-managing-organization#retrieving_your_organization_id). To know how to get folder or project id, visit [here ](https://cloud.google.com/resource-manager/docs/creating-managing-folders#viewing_or_listing_folders_and_projects).
     * 
     */
    @Import(name="scope", required=true)
      private final Output<String> scope;

    public Output<String> scope() {
        return this.scope;
    }

    public IamPolicyAnalysisQueryArgs(
        @Nullable Output<AccessSelectorArgs> accessSelector,
        @Nullable Output<ConditionContextArgs> conditionContext,
        @Nullable Output<IdentitySelectorArgs> identitySelector,
        @Nullable Output<OptionsArgs> options,
        @Nullable Output<ResourceSelectorArgs> resourceSelector,
        Output<String> scope) {
        this.accessSelector = accessSelector;
        this.conditionContext = conditionContext;
        this.identitySelector = identitySelector;
        this.options = options;
        this.resourceSelector = resourceSelector;
        this.scope = Objects.requireNonNull(scope, "expected parameter 'scope' to be non-null");
    }

    private IamPolicyAnalysisQueryArgs() {
        this.accessSelector = Codegen.empty();
        this.conditionContext = Codegen.empty();
        this.identitySelector = Codegen.empty();
        this.options = Codegen.empty();
        this.resourceSelector = Codegen.empty();
        this.scope = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IamPolicyAnalysisQueryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<AccessSelectorArgs> accessSelector;
        private @Nullable Output<ConditionContextArgs> conditionContext;
        private @Nullable Output<IdentitySelectorArgs> identitySelector;
        private @Nullable Output<OptionsArgs> options;
        private @Nullable Output<ResourceSelectorArgs> resourceSelector;
        private Output<String> scope;

        public Builder() {
    	      // Empty
        }

        public Builder(IamPolicyAnalysisQueryArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessSelector = defaults.accessSelector;
    	      this.conditionContext = defaults.conditionContext;
    	      this.identitySelector = defaults.identitySelector;
    	      this.options = defaults.options;
    	      this.resourceSelector = defaults.resourceSelector;
    	      this.scope = defaults.scope;
        }

        public Builder accessSelector(@Nullable Output<AccessSelectorArgs> accessSelector) {
            this.accessSelector = accessSelector;
            return this;
        }
        public Builder accessSelector(@Nullable AccessSelectorArgs accessSelector) {
            this.accessSelector = Codegen.ofNullable(accessSelector);
            return this;
        }
        public Builder conditionContext(@Nullable Output<ConditionContextArgs> conditionContext) {
            this.conditionContext = conditionContext;
            return this;
        }
        public Builder conditionContext(@Nullable ConditionContextArgs conditionContext) {
            this.conditionContext = Codegen.ofNullable(conditionContext);
            return this;
        }
        public Builder identitySelector(@Nullable Output<IdentitySelectorArgs> identitySelector) {
            this.identitySelector = identitySelector;
            return this;
        }
        public Builder identitySelector(@Nullable IdentitySelectorArgs identitySelector) {
            this.identitySelector = Codegen.ofNullable(identitySelector);
            return this;
        }
        public Builder options(@Nullable Output<OptionsArgs> options) {
            this.options = options;
            return this;
        }
        public Builder options(@Nullable OptionsArgs options) {
            this.options = Codegen.ofNullable(options);
            return this;
        }
        public Builder resourceSelector(@Nullable Output<ResourceSelectorArgs> resourceSelector) {
            this.resourceSelector = resourceSelector;
            return this;
        }
        public Builder resourceSelector(@Nullable ResourceSelectorArgs resourceSelector) {
            this.resourceSelector = Codegen.ofNullable(resourceSelector);
            return this;
        }
        public Builder scope(Output<String> scope) {
            this.scope = Objects.requireNonNull(scope);
            return this;
        }
        public Builder scope(String scope) {
            this.scope = Output.of(Objects.requireNonNull(scope));
            return this;
        }        public IamPolicyAnalysisQueryArgs build() {
            return new IamPolicyAnalysisQueryArgs(accessSelector, conditionContext, identitySelector, options, resourceSelector, scope);
        }
    }
}
