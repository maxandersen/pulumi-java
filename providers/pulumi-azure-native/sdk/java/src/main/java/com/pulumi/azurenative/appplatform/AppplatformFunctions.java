// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.appplatform;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.appplatform.inputs.GetApiPortalArgs;
import com.pulumi.azurenative.appplatform.inputs.GetApiPortalCustomDomainArgs;
import com.pulumi.azurenative.appplatform.inputs.GetAppArgs;
import com.pulumi.azurenative.appplatform.inputs.GetAppResourceUploadUrlArgs;
import com.pulumi.azurenative.appplatform.inputs.GetBindingArgs;
import com.pulumi.azurenative.appplatform.inputs.GetBuildServiceBuildResultLogArgs;
import com.pulumi.azurenative.appplatform.inputs.GetBuildServiceBuilderArgs;
import com.pulumi.azurenative.appplatform.inputs.GetBuildServiceResourceUploadUrlArgs;
import com.pulumi.azurenative.appplatform.inputs.GetBuildpackBindingArgs;
import com.pulumi.azurenative.appplatform.inputs.GetCertificateArgs;
import com.pulumi.azurenative.appplatform.inputs.GetConfigurationServiceArgs;
import com.pulumi.azurenative.appplatform.inputs.GetCustomDomainArgs;
import com.pulumi.azurenative.appplatform.inputs.GetDeploymentArgs;
import com.pulumi.azurenative.appplatform.inputs.GetDeploymentLogFileUrlArgs;
import com.pulumi.azurenative.appplatform.inputs.GetGatewayArgs;
import com.pulumi.azurenative.appplatform.inputs.GetGatewayCustomDomainArgs;
import com.pulumi.azurenative.appplatform.inputs.GetGatewayRouteConfigArgs;
import com.pulumi.azurenative.appplatform.inputs.GetServiceArgs;
import com.pulumi.azurenative.appplatform.inputs.GetServiceRegistryArgs;
import com.pulumi.azurenative.appplatform.inputs.GetStorageArgs;
import com.pulumi.azurenative.appplatform.inputs.ListServiceTestKeysArgs;
import com.pulumi.azurenative.appplatform.outputs.GetApiPortalCustomDomainResult;
import com.pulumi.azurenative.appplatform.outputs.GetApiPortalResult;
import com.pulumi.azurenative.appplatform.outputs.GetAppResourceUploadUrlResult;
import com.pulumi.azurenative.appplatform.outputs.GetAppResult;
import com.pulumi.azurenative.appplatform.outputs.GetBindingResult;
import com.pulumi.azurenative.appplatform.outputs.GetBuildServiceBuildResultLogResult;
import com.pulumi.azurenative.appplatform.outputs.GetBuildServiceBuilderResult;
import com.pulumi.azurenative.appplatform.outputs.GetBuildServiceResourceUploadUrlResult;
import com.pulumi.azurenative.appplatform.outputs.GetBuildpackBindingResult;
import com.pulumi.azurenative.appplatform.outputs.GetCertificateResult;
import com.pulumi.azurenative.appplatform.outputs.GetConfigurationServiceResult;
import com.pulumi.azurenative.appplatform.outputs.GetCustomDomainResult;
import com.pulumi.azurenative.appplatform.outputs.GetDeploymentLogFileUrlResult;
import com.pulumi.azurenative.appplatform.outputs.GetDeploymentResult;
import com.pulumi.azurenative.appplatform.outputs.GetGatewayCustomDomainResult;
import com.pulumi.azurenative.appplatform.outputs.GetGatewayResult;
import com.pulumi.azurenative.appplatform.outputs.GetGatewayRouteConfigResult;
import com.pulumi.azurenative.appplatform.outputs.GetServiceRegistryResult;
import com.pulumi.azurenative.appplatform.outputs.GetServiceResult;
import com.pulumi.azurenative.appplatform.outputs.GetStorageResult;
import com.pulumi.azurenative.appplatform.outputs.ListServiceTestKeysResult;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class AppplatformFunctions {
    /**
     * API portal resource
     * API Version: 2022-01-01-preview.
     * 
     */
    public static CompletableFuture<GetApiPortalResult> getApiPortal(GetApiPortalArgs args) {
        return getApiPortal(args, InvokeOptions.Empty);
    }
    /**
     * API portal resource
     * API Version: 2022-01-01-preview.
     * 
     */
    public static CompletableFuture<GetApiPortalResult> getApiPortal(GetApiPortalArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:appplatform:getApiPortal", TypeShape.of(GetApiPortalResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Custom domain of the API portal
     * API Version: 2022-01-01-preview.
     * 
     */
    public static CompletableFuture<GetApiPortalCustomDomainResult> getApiPortalCustomDomain(GetApiPortalCustomDomainArgs args) {
        return getApiPortalCustomDomain(args, InvokeOptions.Empty);
    }
    /**
     * Custom domain of the API portal
     * API Version: 2022-01-01-preview.
     * 
     */
    public static CompletableFuture<GetApiPortalCustomDomainResult> getApiPortalCustomDomain(GetApiPortalCustomDomainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:appplatform:getApiPortalCustomDomain", TypeShape.of(GetApiPortalCustomDomainResult.class), args, Utilities.withVersion(options));
    }
    /**
     * App resource payload
     * API Version: 2020-07-01.
     * 
     */
    public static CompletableFuture<GetAppResult> getApp(GetAppArgs args) {
        return getApp(args, InvokeOptions.Empty);
    }
    /**
     * App resource payload
     * API Version: 2020-07-01.
     * 
     */
    public static CompletableFuture<GetAppResult> getApp(GetAppArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:appplatform:getApp", TypeShape.of(GetAppResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Resource upload definition payload
     * API Version: 2020-07-01.
     * 
     */
    public static CompletableFuture<GetAppResourceUploadUrlResult> getAppResourceUploadUrl(GetAppResourceUploadUrlArgs args) {
        return getAppResourceUploadUrl(args, InvokeOptions.Empty);
    }
    /**
     * Resource upload definition payload
     * API Version: 2020-07-01.
     * 
     */
    public static CompletableFuture<GetAppResourceUploadUrlResult> getAppResourceUploadUrl(GetAppResourceUploadUrlArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:appplatform:getAppResourceUploadUrl", TypeShape.of(GetAppResourceUploadUrlResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Binding resource payload
     * API Version: 2020-07-01.
     * 
     */
    public static CompletableFuture<GetBindingResult> getBinding(GetBindingArgs args) {
        return getBinding(args, InvokeOptions.Empty);
    }
    /**
     * Binding resource payload
     * API Version: 2020-07-01.
     * 
     */
    public static CompletableFuture<GetBindingResult> getBinding(GetBindingArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:appplatform:getBinding", TypeShape.of(GetBindingResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Build result log resource properties payload
     * API Version: 2022-01-01-preview.
     * 
     */
    public static CompletableFuture<GetBuildServiceBuildResultLogResult> getBuildServiceBuildResultLog(GetBuildServiceBuildResultLogArgs args) {
        return getBuildServiceBuildResultLog(args, InvokeOptions.Empty);
    }
    /**
     * Build result log resource properties payload
     * API Version: 2022-01-01-preview.
     * 
     */
    public static CompletableFuture<GetBuildServiceBuildResultLogResult> getBuildServiceBuildResultLog(GetBuildServiceBuildResultLogArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:appplatform:getBuildServiceBuildResultLog", TypeShape.of(GetBuildServiceBuildResultLogResult.class), args, Utilities.withVersion(options));
    }
    /**
     * KPack Builder resource
     * API Version: 2022-01-01-preview.
     * 
     */
    public static CompletableFuture<GetBuildServiceBuilderResult> getBuildServiceBuilder(GetBuildServiceBuilderArgs args) {
        return getBuildServiceBuilder(args, InvokeOptions.Empty);
    }
    /**
     * KPack Builder resource
     * API Version: 2022-01-01-preview.
     * 
     */
    public static CompletableFuture<GetBuildServiceBuilderResult> getBuildServiceBuilder(GetBuildServiceBuilderArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:appplatform:getBuildServiceBuilder", TypeShape.of(GetBuildServiceBuilderResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Resource upload definition payload
     * API Version: 2022-01-01-preview.
     * 
     */
    public static CompletableFuture<GetBuildServiceResourceUploadUrlResult> getBuildServiceResourceUploadUrl(GetBuildServiceResourceUploadUrlArgs args) {
        return getBuildServiceResourceUploadUrl(args, InvokeOptions.Empty);
    }
    /**
     * Resource upload definition payload
     * API Version: 2022-01-01-preview.
     * 
     */
    public static CompletableFuture<GetBuildServiceResourceUploadUrlResult> getBuildServiceResourceUploadUrl(GetBuildServiceResourceUploadUrlArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:appplatform:getBuildServiceResourceUploadUrl", TypeShape.of(GetBuildServiceResourceUploadUrlResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Buildpack Binding Resource object
     * API Version: 2022-01-01-preview.
     * 
     */
    public static CompletableFuture<GetBuildpackBindingResult> getBuildpackBinding(GetBuildpackBindingArgs args) {
        return getBuildpackBinding(args, InvokeOptions.Empty);
    }
    /**
     * Buildpack Binding Resource object
     * API Version: 2022-01-01-preview.
     * 
     */
    public static CompletableFuture<GetBuildpackBindingResult> getBuildpackBinding(GetBuildpackBindingArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:appplatform:getBuildpackBinding", TypeShape.of(GetBuildpackBindingResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Certificate resource payload.
     * API Version: 2020-07-01.
     * 
     */
    public static CompletableFuture<GetCertificateResult> getCertificate(GetCertificateArgs args) {
        return getCertificate(args, InvokeOptions.Empty);
    }
    /**
     * Certificate resource payload.
     * API Version: 2020-07-01.
     * 
     */
    public static CompletableFuture<GetCertificateResult> getCertificate(GetCertificateArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:appplatform:getCertificate", TypeShape.of(GetCertificateResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Application Configuration Service resource
     * API Version: 2022-01-01-preview.
     * 
     */
    public static CompletableFuture<GetConfigurationServiceResult> getConfigurationService(GetConfigurationServiceArgs args) {
        return getConfigurationService(args, InvokeOptions.Empty);
    }
    /**
     * Application Configuration Service resource
     * API Version: 2022-01-01-preview.
     * 
     */
    public static CompletableFuture<GetConfigurationServiceResult> getConfigurationService(GetConfigurationServiceArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:appplatform:getConfigurationService", TypeShape.of(GetConfigurationServiceResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Custom domain resource payload.
     * API Version: 2020-07-01.
     * 
     */
    public static CompletableFuture<GetCustomDomainResult> getCustomDomain(GetCustomDomainArgs args) {
        return getCustomDomain(args, InvokeOptions.Empty);
    }
    /**
     * Custom domain resource payload.
     * API Version: 2020-07-01.
     * 
     */
    public static CompletableFuture<GetCustomDomainResult> getCustomDomain(GetCustomDomainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:appplatform:getCustomDomain", TypeShape.of(GetCustomDomainResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Deployment resource payload
     * API Version: 2020-07-01.
     * 
     */
    public static CompletableFuture<GetDeploymentResult> getDeployment(GetDeploymentArgs args) {
        return getDeployment(args, InvokeOptions.Empty);
    }
    /**
     * Deployment resource payload
     * API Version: 2020-07-01.
     * 
     */
    public static CompletableFuture<GetDeploymentResult> getDeployment(GetDeploymentArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:appplatform:getDeployment", TypeShape.of(GetDeploymentResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Log file URL payload
     * API Version: 2020-07-01.
     * 
     */
    public static CompletableFuture<GetDeploymentLogFileUrlResult> getDeploymentLogFileUrl(GetDeploymentLogFileUrlArgs args) {
        return getDeploymentLogFileUrl(args, InvokeOptions.Empty);
    }
    /**
     * Log file URL payload
     * API Version: 2020-07-01.
     * 
     */
    public static CompletableFuture<GetDeploymentLogFileUrlResult> getDeploymentLogFileUrl(GetDeploymentLogFileUrlArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:appplatform:getDeploymentLogFileUrl", TypeShape.of(GetDeploymentLogFileUrlResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Spring Cloud Gateway resource
     * API Version: 2022-01-01-preview.
     * 
     */
    public static CompletableFuture<GetGatewayResult> getGateway(GetGatewayArgs args) {
        return getGateway(args, InvokeOptions.Empty);
    }
    /**
     * Spring Cloud Gateway resource
     * API Version: 2022-01-01-preview.
     * 
     */
    public static CompletableFuture<GetGatewayResult> getGateway(GetGatewayArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:appplatform:getGateway", TypeShape.of(GetGatewayResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Custom domain of the Spring Cloud Gateway
     * API Version: 2022-01-01-preview.
     * 
     */
    public static CompletableFuture<GetGatewayCustomDomainResult> getGatewayCustomDomain(GetGatewayCustomDomainArgs args) {
        return getGatewayCustomDomain(args, InvokeOptions.Empty);
    }
    /**
     * Custom domain of the Spring Cloud Gateway
     * API Version: 2022-01-01-preview.
     * 
     */
    public static CompletableFuture<GetGatewayCustomDomainResult> getGatewayCustomDomain(GetGatewayCustomDomainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:appplatform:getGatewayCustomDomain", TypeShape.of(GetGatewayCustomDomainResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Spring Cloud Gateway route config resource
     * API Version: 2022-01-01-preview.
     * 
     */
    public static CompletableFuture<GetGatewayRouteConfigResult> getGatewayRouteConfig(GetGatewayRouteConfigArgs args) {
        return getGatewayRouteConfig(args, InvokeOptions.Empty);
    }
    /**
     * Spring Cloud Gateway route config resource
     * API Version: 2022-01-01-preview.
     * 
     */
    public static CompletableFuture<GetGatewayRouteConfigResult> getGatewayRouteConfig(GetGatewayRouteConfigArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:appplatform:getGatewayRouteConfig", TypeShape.of(GetGatewayRouteConfigResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Service resource
     * API Version: 2020-07-01.
     * 
     */
    public static CompletableFuture<GetServiceResult> getService(GetServiceArgs args) {
        return getService(args, InvokeOptions.Empty);
    }
    /**
     * Service resource
     * API Version: 2020-07-01.
     * 
     */
    public static CompletableFuture<GetServiceResult> getService(GetServiceArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:appplatform:getService", TypeShape.of(GetServiceResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Service Registry resource
     * API Version: 2022-01-01-preview.
     * 
     */
    public static CompletableFuture<GetServiceRegistryResult> getServiceRegistry(GetServiceRegistryArgs args) {
        return getServiceRegistry(args, InvokeOptions.Empty);
    }
    /**
     * Service Registry resource
     * API Version: 2022-01-01-preview.
     * 
     */
    public static CompletableFuture<GetServiceRegistryResult> getServiceRegistry(GetServiceRegistryArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:appplatform:getServiceRegistry", TypeShape.of(GetServiceRegistryResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Storage resource payload.
     * API Version: 2021-09-01-preview.
     * 
     */
    public static CompletableFuture<GetStorageResult> getStorage(GetStorageArgs args) {
        return getStorage(args, InvokeOptions.Empty);
    }
    /**
     * Storage resource payload.
     * API Version: 2021-09-01-preview.
     * 
     */
    public static CompletableFuture<GetStorageResult> getStorage(GetStorageArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:appplatform:getStorage", TypeShape.of(GetStorageResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Test keys payload
     * API Version: 2020-07-01.
     * 
     */
    public static CompletableFuture<ListServiceTestKeysResult> listServiceTestKeys(ListServiceTestKeysArgs args) {
        return listServiceTestKeys(args, InvokeOptions.Empty);
    }
    /**
     * Test keys payload
     * API Version: 2020-07-01.
     * 
     */
    public static CompletableFuture<ListServiceTestKeysResult> listServiceTestKeys(ListServiceTestKeysArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:appplatform:listServiceTestKeys", TypeShape.of(ListServiceTestKeysResult.class), args, Utilities.withVersion(options));
    }
}
