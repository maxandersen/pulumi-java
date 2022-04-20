// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.organizations;

import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.organizations.inputs.GetActiveFolderArgs;
import com.pulumi.gcp.organizations.inputs.GetBillingAccountArgs;
import com.pulumi.gcp.organizations.inputs.GetFolderArgs;
import com.pulumi.gcp.organizations.inputs.GetFoldersArgs;
import com.pulumi.gcp.organizations.inputs.GetIAMPolicyArgs;
import com.pulumi.gcp.organizations.inputs.GetOrganizationArgs;
import com.pulumi.gcp.organizations.inputs.GetProjectArgs;
import com.pulumi.gcp.organizations.outputs.GetActiveFolderResult;
import com.pulumi.gcp.organizations.outputs.GetBillingAccountResult;
import com.pulumi.gcp.organizations.outputs.GetClientConfigResult;
import com.pulumi.gcp.organizations.outputs.GetClientOpenIdUserInfoResult;
import com.pulumi.gcp.organizations.outputs.GetFolderResult;
import com.pulumi.gcp.organizations.outputs.GetFoldersResult;
import com.pulumi.gcp.organizations.outputs.GetIAMPolicyResult;
import com.pulumi.gcp.organizations.outputs.GetOrganizationResult;
import com.pulumi.gcp.organizations.outputs.GetProjectResult;
import com.pulumi.resources.InvokeArgs;
import java.util.concurrent.CompletableFuture;

public final class OrganizationsFunctions {
    /**
     * Get an active folder within GCP by `display_name` and `parent`.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetActiveFolderResult> getActiveFolder(GetActiveFolderArgs args) {
        return getActiveFolder(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetActiveFolderResult> getActiveFolder(GetActiveFolderArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("gcp:organizations/getActiveFolder:getActiveFolder", TypeShape.of(GetActiveFolderResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to get information about a Google Billing Account.
     * 
     */
    public static CompletableFuture<GetBillingAccountResult> getBillingAccount() {
        return getBillingAccount(GetBillingAccountArgs.Empty, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetBillingAccountResult> getBillingAccount(GetBillingAccountArgs args) {
        return getBillingAccount(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetBillingAccountResult> getBillingAccount(GetBillingAccountArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("gcp:organizations/getBillingAccount:getBillingAccount", TypeShape.of(GetBillingAccountResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to access the configuration of the Google Cloud provider.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetClientConfigResult> getClientConfig() {
        return getClientConfig(InvokeArgs.Empty, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetClientConfigResult> getClientConfig(InvokeArgs args) {
        return getClientConfig(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetClientConfigResult> getClientConfig(InvokeArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("gcp:organizations/getClientConfig:getClientConfig", TypeShape.of(GetClientConfigResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Get OpenID userinfo about the credentials used with the Google provider,
     * specifically the email.
     * 
     * This datasource enables you to export the email of the account you&#39;ve
     * authenticated the provider with; this can be used alongside
     * `data.google_client_config`&#39;s `access_token` to perform OpenID Connect
     * authentication with GKE and configure an RBAC role for the email used.
     * 
     * &gt; This resource will only work as expected if the provider is configured to
     * use the `https://www.googleapis.com/auth/userinfo.email` scope! You will
     * receive an error otherwise.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetClientOpenIdUserInfoResult> getClientOpenIdUserInfo() {
        return getClientOpenIdUserInfo(InvokeArgs.Empty, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetClientOpenIdUserInfoResult> getClientOpenIdUserInfo(InvokeArgs args) {
        return getClientOpenIdUserInfo(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetClientOpenIdUserInfoResult> getClientOpenIdUserInfo(InvokeArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("gcp:organizations/getClientOpenIdUserInfo:getClientOpenIdUserInfo", TypeShape.of(GetClientOpenIdUserInfoResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to get information about a Google Cloud Folder.
     * 
     */
    public static CompletableFuture<GetFolderResult> getFolder(GetFolderArgs args) {
        return getFolder(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetFolderResult> getFolder(GetFolderArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("gcp:organizations/getFolder:getFolder", TypeShape.of(GetFolderResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Retrieve information about a set of folders based on a parent ID. See the
     * [REST API](https://cloud.google.com/resource-manager/reference/rest/v3/folders/list)
     * for more details.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetFoldersResult> getFolders(GetFoldersArgs args) {
        return getFolders(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetFoldersResult> getFolders(GetFoldersArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("gcp:organizations/getFolders:getFolders", TypeShape.of(GetFoldersResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Generates an IAM policy document that may be referenced by and applied to
     * other Google Cloud Platform IAM resources, such as the `gcp.projects.IAMPolicy` resource.
     * 
     * **Note:** Please review the documentation of the resource that you will be using the datasource with. Some resources such as `gcp.projects.IAMPolicy` and others have limitations in their API methods which are noted on their respective page.
     * 
     * This data source is used to define IAM policies to apply to other resources.
     * Currently, defining a policy through a datasource and referencing that policy
     * from another resource is the only way to apply an IAM policy to a resource.
     * 
     */
    public static CompletableFuture<GetIAMPolicyResult> getIAMPolicy() {
        return getIAMPolicy(GetIAMPolicyArgs.Empty, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetIAMPolicyResult> getIAMPolicy(GetIAMPolicyArgs args) {
        return getIAMPolicy(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetIAMPolicyResult> getIAMPolicy(GetIAMPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("gcp:organizations/getIAMPolicy:getIAMPolicy", TypeShape.of(GetIAMPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Get information about a Google Cloud Organization. Note that you must have the `roles/resourcemanager.organizationViewer` role (or equivalent permissions) at the organization level to use this datasource.
     * 
     */
    public static CompletableFuture<GetOrganizationResult> getOrganization() {
        return getOrganization(GetOrganizationArgs.Empty, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetOrganizationResult> getOrganization(GetOrganizationArgs args) {
        return getOrganization(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetOrganizationResult> getOrganization(GetOrganizationArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("gcp:organizations/getOrganization:getOrganization", TypeShape.of(GetOrganizationResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to get project details.
     * For more information see
     * [API](https://cloud.google.com/resource-manager/reference/rest/v1/projects#Project)
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetProjectResult> getProject() {
        return getProject(GetProjectArgs.Empty, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetProjectResult> getProject(GetProjectArgs args) {
        return getProject(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetProjectResult> getProject(GetProjectArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("gcp:organizations/getProject:getProject", TypeShape.of(GetProjectResult.class), args, Utilities.withVersion(options));
    }
}
