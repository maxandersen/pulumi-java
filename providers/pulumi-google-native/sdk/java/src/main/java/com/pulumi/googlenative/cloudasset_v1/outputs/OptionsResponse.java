// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudasset_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;

@CustomType
public final class OptionsResponse {
    /**
     * Optional. If true, the response will include access analysis from identities to resources via service account impersonation. This is a very expensive operation, because many derived queries will be executed. We highly recommend you use AssetService.AnalyzeIamPolicyLongrunning rpc instead. For example, if the request analyzes for which resources user A has permission P, and there&#39;s an IAM policy states user A has iam.serviceAccounts.getAccessToken permission to a service account SA, and there&#39;s another IAM policy states service account SA has permission P to a GCP folder F, then user A potentially has access to the GCP folder F. And those advanced analysis results will be included in AnalyzeIamPolicyResponse.service_account_impersonation_analysis. Another example, if the request analyzes for who has permission P to a GCP folder F, and there&#39;s an IAM policy states user A has iam.serviceAccounts.actAs permission to a service account SA, and there&#39;s another IAM policy states service account SA has permission P to the GCP folder F, then user A potentially has access to the GCP folder F. And those advanced analysis results will be included in AnalyzeIamPolicyResponse.service_account_impersonation_analysis. Only the following permissions are considered in this analysis: * `iam.serviceAccounts.actAs` * `iam.serviceAccounts.signBlob` * `iam.serviceAccounts.signJwt` * `iam.serviceAccounts.getAccessToken` * `iam.serviceAccounts.getOpenIdToken` * `iam.serviceAccounts.implicitDelegation` Default is false.
     * 
     */
    private final Boolean analyzeServiceAccountImpersonation;
    /**
     * Optional. If true, the identities section of the result will expand any Google groups appearing in an IAM policy binding. If IamPolicyAnalysisQuery.identity_selector is specified, the identity in the result will be determined by the selector, and this flag is not allowed to set. If true, the default max expansion per group is 1000 for AssetService.AnalyzeIamPolicy][]. Default is false.
     * 
     */
    private final Boolean expandGroups;
    /**
     * Optional. If true and IamPolicyAnalysisQuery.resource_selector is not specified, the resource section of the result will expand any resource attached to an IAM policy to include resources lower in the resource hierarchy. For example, if the request analyzes for which resources user A has permission P, and the results include an IAM policy with P on a GCP folder, the results will also include resources in that folder with permission P. If true and IamPolicyAnalysisQuery.resource_selector is specified, the resource section of the result will expand the specified resource to include resources lower in the resource hierarchy. Only project or lower resources are supported. Folder and organization resource cannot be used together with this option. For example, if the request analyzes for which users have permission P on a GCP project with this option enabled, the results will include all users who have permission P on that project or any lower resource. If true, the default max expansion per resource is 1000 for AssetService.AnalyzeIamPolicy][] and 100000 for AssetService.AnalyzeIamPolicyLongrunning][]. Default is false.
     * 
     */
    private final Boolean expandResources;
    /**
     * Optional. If true, the access section of result will expand any roles appearing in IAM policy bindings to include their permissions. If IamPolicyAnalysisQuery.access_selector is specified, the access section of the result will be determined by the selector, and this flag is not allowed to set. Default is false.
     * 
     */
    private final Boolean expandRoles;
    /**
     * Optional. If true, the result will output the relevant membership relationships between groups and other groups, and between groups and principals. Default is false.
     * 
     */
    private final Boolean outputGroupEdges;
    /**
     * Optional. If true, the result will output the relevant parent/child relationships between resources. Default is false.
     * 
     */
    private final Boolean outputResourceEdges;

    @CustomType.Constructor
    private OptionsResponse(
        @CustomType.Parameter("analyzeServiceAccountImpersonation") Boolean analyzeServiceAccountImpersonation,
        @CustomType.Parameter("expandGroups") Boolean expandGroups,
        @CustomType.Parameter("expandResources") Boolean expandResources,
        @CustomType.Parameter("expandRoles") Boolean expandRoles,
        @CustomType.Parameter("outputGroupEdges") Boolean outputGroupEdges,
        @CustomType.Parameter("outputResourceEdges") Boolean outputResourceEdges) {
        this.analyzeServiceAccountImpersonation = analyzeServiceAccountImpersonation;
        this.expandGroups = expandGroups;
        this.expandResources = expandResources;
        this.expandRoles = expandRoles;
        this.outputGroupEdges = outputGroupEdges;
        this.outputResourceEdges = outputResourceEdges;
    }

    /**
     * Optional. If true, the response will include access analysis from identities to resources via service account impersonation. This is a very expensive operation, because many derived queries will be executed. We highly recommend you use AssetService.AnalyzeIamPolicyLongrunning rpc instead. For example, if the request analyzes for which resources user A has permission P, and there&#39;s an IAM policy states user A has iam.serviceAccounts.getAccessToken permission to a service account SA, and there&#39;s another IAM policy states service account SA has permission P to a GCP folder F, then user A potentially has access to the GCP folder F. And those advanced analysis results will be included in AnalyzeIamPolicyResponse.service_account_impersonation_analysis. Another example, if the request analyzes for who has permission P to a GCP folder F, and there&#39;s an IAM policy states user A has iam.serviceAccounts.actAs permission to a service account SA, and there&#39;s another IAM policy states service account SA has permission P to the GCP folder F, then user A potentially has access to the GCP folder F. And those advanced analysis results will be included in AnalyzeIamPolicyResponse.service_account_impersonation_analysis. Only the following permissions are considered in this analysis: * `iam.serviceAccounts.actAs` * `iam.serviceAccounts.signBlob` * `iam.serviceAccounts.signJwt` * `iam.serviceAccounts.getAccessToken` * `iam.serviceAccounts.getOpenIdToken` * `iam.serviceAccounts.implicitDelegation` Default is false.
     * 
    */
    public Boolean analyzeServiceAccountImpersonation() {
        return this.analyzeServiceAccountImpersonation;
    }
    /**
     * Optional. If true, the identities section of the result will expand any Google groups appearing in an IAM policy binding. If IamPolicyAnalysisQuery.identity_selector is specified, the identity in the result will be determined by the selector, and this flag is not allowed to set. If true, the default max expansion per group is 1000 for AssetService.AnalyzeIamPolicy][]. Default is false.
     * 
    */
    public Boolean expandGroups() {
        return this.expandGroups;
    }
    /**
     * Optional. If true and IamPolicyAnalysisQuery.resource_selector is not specified, the resource section of the result will expand any resource attached to an IAM policy to include resources lower in the resource hierarchy. For example, if the request analyzes for which resources user A has permission P, and the results include an IAM policy with P on a GCP folder, the results will also include resources in that folder with permission P. If true and IamPolicyAnalysisQuery.resource_selector is specified, the resource section of the result will expand the specified resource to include resources lower in the resource hierarchy. Only project or lower resources are supported. Folder and organization resource cannot be used together with this option. For example, if the request analyzes for which users have permission P on a GCP project with this option enabled, the results will include all users who have permission P on that project or any lower resource. If true, the default max expansion per resource is 1000 for AssetService.AnalyzeIamPolicy][] and 100000 for AssetService.AnalyzeIamPolicyLongrunning][]. Default is false.
     * 
    */
    public Boolean expandResources() {
        return this.expandResources;
    }
    /**
     * Optional. If true, the access section of result will expand any roles appearing in IAM policy bindings to include their permissions. If IamPolicyAnalysisQuery.access_selector is specified, the access section of the result will be determined by the selector, and this flag is not allowed to set. Default is false.
     * 
    */
    public Boolean expandRoles() {
        return this.expandRoles;
    }
    /**
     * Optional. If true, the result will output the relevant membership relationships between groups and other groups, and between groups and principals. Default is false.
     * 
    */
    public Boolean outputGroupEdges() {
        return this.outputGroupEdges;
    }
    /**
     * Optional. If true, the result will output the relevant parent/child relationships between resources. Default is false.
     * 
    */
    public Boolean outputResourceEdges() {
        return this.outputResourceEdges;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OptionsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean analyzeServiceAccountImpersonation;
        private Boolean expandGroups;
        private Boolean expandResources;
        private Boolean expandRoles;
        private Boolean outputGroupEdges;
        private Boolean outputResourceEdges;

        public Builder() {
    	      // Empty
        }

        public Builder(OptionsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.analyzeServiceAccountImpersonation = defaults.analyzeServiceAccountImpersonation;
    	      this.expandGroups = defaults.expandGroups;
    	      this.expandResources = defaults.expandResources;
    	      this.expandRoles = defaults.expandRoles;
    	      this.outputGroupEdges = defaults.outputGroupEdges;
    	      this.outputResourceEdges = defaults.outputResourceEdges;
        }

        public Builder analyzeServiceAccountImpersonation(Boolean analyzeServiceAccountImpersonation) {
            this.analyzeServiceAccountImpersonation = Objects.requireNonNull(analyzeServiceAccountImpersonation);
            return this;
        }
        public Builder expandGroups(Boolean expandGroups) {
            this.expandGroups = Objects.requireNonNull(expandGroups);
            return this;
        }
        public Builder expandResources(Boolean expandResources) {
            this.expandResources = Objects.requireNonNull(expandResources);
            return this;
        }
        public Builder expandRoles(Boolean expandRoles) {
            this.expandRoles = Objects.requireNonNull(expandRoles);
            return this;
        }
        public Builder outputGroupEdges(Boolean outputGroupEdges) {
            this.outputGroupEdges = Objects.requireNonNull(outputGroupEdges);
            return this;
        }
        public Builder outputResourceEdges(Boolean outputResourceEdges) {
            this.outputResourceEdges = Objects.requireNonNull(outputResourceEdges);
            return this;
        }        public OptionsResponse build() {
            return new OptionsResponse(analyzeServiceAccountImpersonation, expandGroups, expandResources, expandRoles, outputGroupEdges, outputResourceEdges);
        }
    }
}
