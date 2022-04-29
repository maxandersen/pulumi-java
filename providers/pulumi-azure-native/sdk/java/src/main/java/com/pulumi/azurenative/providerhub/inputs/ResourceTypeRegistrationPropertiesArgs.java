// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.providerhub.inputs;

import com.pulumi.azurenative.providerhub.enums.ProvisioningState;
import com.pulumi.azurenative.providerhub.enums.Regionality;
import com.pulumi.azurenative.providerhub.enums.ResourceDeletionPolicy;
import com.pulumi.azurenative.providerhub.enums.RoutingType;
import com.pulumi.azurenative.providerhub.inputs.AuthorizationActionMappingArgs;
import com.pulumi.azurenative.providerhub.inputs.ExtendedLocationOptionsArgs;
import com.pulumi.azurenative.providerhub.inputs.LinkedAccessCheckArgs;
import com.pulumi.azurenative.providerhub.inputs.LoggingRuleArgs;
import com.pulumi.azurenative.providerhub.inputs.ResourceTypeEndpointArgs;
import com.pulumi.azurenative.providerhub.inputs.ResourceTypeRegistrationPropertiesCheckNameAvailabilitySpecificationsArgs;
import com.pulumi.azurenative.providerhub.inputs.ResourceTypeRegistrationPropertiesExtensionOptionsArgs;
import com.pulumi.azurenative.providerhub.inputs.ResourceTypeRegistrationPropertiesFeaturesRuleArgs;
import com.pulumi.azurenative.providerhub.inputs.ResourceTypeRegistrationPropertiesIdentityManagementArgs;
import com.pulumi.azurenative.providerhub.inputs.ResourceTypeRegistrationPropertiesRequestHeaderOptionsArgs;
import com.pulumi.azurenative.providerhub.inputs.ResourceTypeRegistrationPropertiesResourceMovePolicyArgs;
import com.pulumi.azurenative.providerhub.inputs.ResourceTypeRegistrationPropertiesSubscriptionLifecycleNotificationSpecificationsArgs;
import com.pulumi.azurenative.providerhub.inputs.ResourceTypeRegistrationPropertiesTemplateDeploymentOptionsArgs;
import com.pulumi.azurenative.providerhub.inputs.ServiceTreeInfoArgs;
import com.pulumi.azurenative.providerhub.inputs.SubscriptionStateRuleArgs;
import com.pulumi.azurenative.providerhub.inputs.SwaggerSpecificationArgs;
import com.pulumi.azurenative.providerhub.inputs.ThrottlingRuleArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ResourceTypeRegistrationPropertiesArgs extends ResourceArgs {

    public static final ResourceTypeRegistrationPropertiesArgs Empty = new ResourceTypeRegistrationPropertiesArgs();

    @Import(name="allowedUnauthorizedActions")
    private @Nullable Output<List<String>> allowedUnauthorizedActions;

    public Optional<Output<List<String>>> allowedUnauthorizedActions() {
        return Optional.ofNullable(this.allowedUnauthorizedActions);
    }

    @Import(name="authorizationActionMappings")
    private @Nullable Output<List<AuthorizationActionMappingArgs>> authorizationActionMappings;

    public Optional<Output<List<AuthorizationActionMappingArgs>>> authorizationActionMappings() {
        return Optional.ofNullable(this.authorizationActionMappings);
    }

    @Import(name="checkNameAvailabilitySpecifications")
    private @Nullable Output<ResourceTypeRegistrationPropertiesCheckNameAvailabilitySpecificationsArgs> checkNameAvailabilitySpecifications;

    public Optional<Output<ResourceTypeRegistrationPropertiesCheckNameAvailabilitySpecificationsArgs>> checkNameAvailabilitySpecifications() {
        return Optional.ofNullable(this.checkNameAvailabilitySpecifications);
    }

    @Import(name="defaultApiVersion")
    private @Nullable Output<String> defaultApiVersion;

    public Optional<Output<String>> defaultApiVersion() {
        return Optional.ofNullable(this.defaultApiVersion);
    }

    @Import(name="disallowedActionVerbs")
    private @Nullable Output<List<String>> disallowedActionVerbs;

    public Optional<Output<List<String>>> disallowedActionVerbs() {
        return Optional.ofNullable(this.disallowedActionVerbs);
    }

    @Import(name="enableAsyncOperation")
    private @Nullable Output<Boolean> enableAsyncOperation;

    public Optional<Output<Boolean>> enableAsyncOperation() {
        return Optional.ofNullable(this.enableAsyncOperation);
    }

    @Import(name="enableThirdPartyS2S")
    private @Nullable Output<Boolean> enableThirdPartyS2S;

    public Optional<Output<Boolean>> enableThirdPartyS2S() {
        return Optional.ofNullable(this.enableThirdPartyS2S);
    }

    @Import(name="endpoints")
    private @Nullable Output<List<ResourceTypeEndpointArgs>> endpoints;

    public Optional<Output<List<ResourceTypeEndpointArgs>>> endpoints() {
        return Optional.ofNullable(this.endpoints);
    }

    @Import(name="extendedLocations")
    private @Nullable Output<List<ExtendedLocationOptionsArgs>> extendedLocations;

    public Optional<Output<List<ExtendedLocationOptionsArgs>>> extendedLocations() {
        return Optional.ofNullable(this.extendedLocations);
    }

    @Import(name="extensionOptions")
    private @Nullable Output<ResourceTypeRegistrationPropertiesExtensionOptionsArgs> extensionOptions;

    public Optional<Output<ResourceTypeRegistrationPropertiesExtensionOptionsArgs>> extensionOptions() {
        return Optional.ofNullable(this.extensionOptions);
    }

    @Import(name="featuresRule")
    private @Nullable Output<ResourceTypeRegistrationPropertiesFeaturesRuleArgs> featuresRule;

    public Optional<Output<ResourceTypeRegistrationPropertiesFeaturesRuleArgs>> featuresRule() {
        return Optional.ofNullable(this.featuresRule);
    }

    @Import(name="identityManagement")
    private @Nullable Output<ResourceTypeRegistrationPropertiesIdentityManagementArgs> identityManagement;

    public Optional<Output<ResourceTypeRegistrationPropertiesIdentityManagementArgs>> identityManagement() {
        return Optional.ofNullable(this.identityManagement);
    }

    @Import(name="isPureProxy")
    private @Nullable Output<Boolean> isPureProxy;

    public Optional<Output<Boolean>> isPureProxy() {
        return Optional.ofNullable(this.isPureProxy);
    }

    @Import(name="linkedAccessChecks")
    private @Nullable Output<List<LinkedAccessCheckArgs>> linkedAccessChecks;

    public Optional<Output<List<LinkedAccessCheckArgs>>> linkedAccessChecks() {
        return Optional.ofNullable(this.linkedAccessChecks);
    }

    @Import(name="loggingRules")
    private @Nullable Output<List<LoggingRuleArgs>> loggingRules;

    public Optional<Output<List<LoggingRuleArgs>>> loggingRules() {
        return Optional.ofNullable(this.loggingRules);
    }

    @Import(name="marketplaceType")
    private @Nullable Output<String> marketplaceType;

    public Optional<Output<String>> marketplaceType() {
        return Optional.ofNullable(this.marketplaceType);
    }

    @Import(name="provisioningState")
    private @Nullable Output<Either<String,ProvisioningState>> provisioningState;

    public Optional<Output<Either<String,ProvisioningState>>> provisioningState() {
        return Optional.ofNullable(this.provisioningState);
    }

    @Import(name="regionality")
    private @Nullable Output<Either<String,Regionality>> regionality;

    public Optional<Output<Either<String,Regionality>>> regionality() {
        return Optional.ofNullable(this.regionality);
    }

    @Import(name="requestHeaderOptions")
    private @Nullable Output<ResourceTypeRegistrationPropertiesRequestHeaderOptionsArgs> requestHeaderOptions;

    public Optional<Output<ResourceTypeRegistrationPropertiesRequestHeaderOptionsArgs>> requestHeaderOptions() {
        return Optional.ofNullable(this.requestHeaderOptions);
    }

    @Import(name="requiredFeatures")
    private @Nullable Output<List<String>> requiredFeatures;

    public Optional<Output<List<String>>> requiredFeatures() {
        return Optional.ofNullable(this.requiredFeatures);
    }

    @Import(name="resourceDeletionPolicy")
    private @Nullable Output<Either<String,ResourceDeletionPolicy>> resourceDeletionPolicy;

    public Optional<Output<Either<String,ResourceDeletionPolicy>>> resourceDeletionPolicy() {
        return Optional.ofNullable(this.resourceDeletionPolicy);
    }

    @Import(name="resourceMovePolicy")
    private @Nullable Output<ResourceTypeRegistrationPropertiesResourceMovePolicyArgs> resourceMovePolicy;

    public Optional<Output<ResourceTypeRegistrationPropertiesResourceMovePolicyArgs>> resourceMovePolicy() {
        return Optional.ofNullable(this.resourceMovePolicy);
    }

    @Import(name="routingType")
    private @Nullable Output<Either<String,RoutingType>> routingType;

    public Optional<Output<Either<String,RoutingType>>> routingType() {
        return Optional.ofNullable(this.routingType);
    }

    @Import(name="serviceTreeInfos")
    private @Nullable Output<List<ServiceTreeInfoArgs>> serviceTreeInfos;

    public Optional<Output<List<ServiceTreeInfoArgs>>> serviceTreeInfos() {
        return Optional.ofNullable(this.serviceTreeInfos);
    }

    @Import(name="subscriptionLifecycleNotificationSpecifications")
    private @Nullable Output<ResourceTypeRegistrationPropertiesSubscriptionLifecycleNotificationSpecificationsArgs> subscriptionLifecycleNotificationSpecifications;

    public Optional<Output<ResourceTypeRegistrationPropertiesSubscriptionLifecycleNotificationSpecificationsArgs>> subscriptionLifecycleNotificationSpecifications() {
        return Optional.ofNullable(this.subscriptionLifecycleNotificationSpecifications);
    }

    @Import(name="subscriptionStateRules")
    private @Nullable Output<List<SubscriptionStateRuleArgs>> subscriptionStateRules;

    public Optional<Output<List<SubscriptionStateRuleArgs>>> subscriptionStateRules() {
        return Optional.ofNullable(this.subscriptionStateRules);
    }

    @Import(name="swaggerSpecifications")
    private @Nullable Output<List<SwaggerSpecificationArgs>> swaggerSpecifications;

    public Optional<Output<List<SwaggerSpecificationArgs>>> swaggerSpecifications() {
        return Optional.ofNullable(this.swaggerSpecifications);
    }

    @Import(name="templateDeploymentOptions")
    private @Nullable Output<ResourceTypeRegistrationPropertiesTemplateDeploymentOptionsArgs> templateDeploymentOptions;

    public Optional<Output<ResourceTypeRegistrationPropertiesTemplateDeploymentOptionsArgs>> templateDeploymentOptions() {
        return Optional.ofNullable(this.templateDeploymentOptions);
    }

    @Import(name="throttlingRules")
    private @Nullable Output<List<ThrottlingRuleArgs>> throttlingRules;

    public Optional<Output<List<ThrottlingRuleArgs>>> throttlingRules() {
        return Optional.ofNullable(this.throttlingRules);
    }

    private ResourceTypeRegistrationPropertiesArgs() {}

    private ResourceTypeRegistrationPropertiesArgs(ResourceTypeRegistrationPropertiesArgs $) {
        this.allowedUnauthorizedActions = $.allowedUnauthorizedActions;
        this.authorizationActionMappings = $.authorizationActionMappings;
        this.checkNameAvailabilitySpecifications = $.checkNameAvailabilitySpecifications;
        this.defaultApiVersion = $.defaultApiVersion;
        this.disallowedActionVerbs = $.disallowedActionVerbs;
        this.enableAsyncOperation = $.enableAsyncOperation;
        this.enableThirdPartyS2S = $.enableThirdPartyS2S;
        this.endpoints = $.endpoints;
        this.extendedLocations = $.extendedLocations;
        this.extensionOptions = $.extensionOptions;
        this.featuresRule = $.featuresRule;
        this.identityManagement = $.identityManagement;
        this.isPureProxy = $.isPureProxy;
        this.linkedAccessChecks = $.linkedAccessChecks;
        this.loggingRules = $.loggingRules;
        this.marketplaceType = $.marketplaceType;
        this.provisioningState = $.provisioningState;
        this.regionality = $.regionality;
        this.requestHeaderOptions = $.requestHeaderOptions;
        this.requiredFeatures = $.requiredFeatures;
        this.resourceDeletionPolicy = $.resourceDeletionPolicy;
        this.resourceMovePolicy = $.resourceMovePolicy;
        this.routingType = $.routingType;
        this.serviceTreeInfos = $.serviceTreeInfos;
        this.subscriptionLifecycleNotificationSpecifications = $.subscriptionLifecycleNotificationSpecifications;
        this.subscriptionStateRules = $.subscriptionStateRules;
        this.swaggerSpecifications = $.swaggerSpecifications;
        this.templateDeploymentOptions = $.templateDeploymentOptions;
        this.throttlingRules = $.throttlingRules;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ResourceTypeRegistrationPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResourceTypeRegistrationPropertiesArgs $;

        public Builder() {
            $ = new ResourceTypeRegistrationPropertiesArgs();
        }

        public Builder(ResourceTypeRegistrationPropertiesArgs defaults) {
            $ = new ResourceTypeRegistrationPropertiesArgs(Objects.requireNonNull(defaults));
        }

        public Builder allowedUnauthorizedActions(@Nullable Output<List<String>> allowedUnauthorizedActions) {
            $.allowedUnauthorizedActions = allowedUnauthorizedActions;
            return this;
        }

        public Builder allowedUnauthorizedActions(List<String> allowedUnauthorizedActions) {
            return allowedUnauthorizedActions(Output.of(allowedUnauthorizedActions));
        }

        public Builder allowedUnauthorizedActions(String... allowedUnauthorizedActions) {
            return allowedUnauthorizedActions(List.of(allowedUnauthorizedActions));
        }

        public Builder authorizationActionMappings(@Nullable Output<List<AuthorizationActionMappingArgs>> authorizationActionMappings) {
            $.authorizationActionMappings = authorizationActionMappings;
            return this;
        }

        public Builder authorizationActionMappings(List<AuthorizationActionMappingArgs> authorizationActionMappings) {
            return authorizationActionMappings(Output.of(authorizationActionMappings));
        }

        public Builder authorizationActionMappings(AuthorizationActionMappingArgs... authorizationActionMappings) {
            return authorizationActionMappings(List.of(authorizationActionMappings));
        }

        public Builder checkNameAvailabilitySpecifications(@Nullable Output<ResourceTypeRegistrationPropertiesCheckNameAvailabilitySpecificationsArgs> checkNameAvailabilitySpecifications) {
            $.checkNameAvailabilitySpecifications = checkNameAvailabilitySpecifications;
            return this;
        }

        public Builder checkNameAvailabilitySpecifications(ResourceTypeRegistrationPropertiesCheckNameAvailabilitySpecificationsArgs checkNameAvailabilitySpecifications) {
            return checkNameAvailabilitySpecifications(Output.of(checkNameAvailabilitySpecifications));
        }

        public Builder defaultApiVersion(@Nullable Output<String> defaultApiVersion) {
            $.defaultApiVersion = defaultApiVersion;
            return this;
        }

        public Builder defaultApiVersion(String defaultApiVersion) {
            return defaultApiVersion(Output.of(defaultApiVersion));
        }

        public Builder disallowedActionVerbs(@Nullable Output<List<String>> disallowedActionVerbs) {
            $.disallowedActionVerbs = disallowedActionVerbs;
            return this;
        }

        public Builder disallowedActionVerbs(List<String> disallowedActionVerbs) {
            return disallowedActionVerbs(Output.of(disallowedActionVerbs));
        }

        public Builder disallowedActionVerbs(String... disallowedActionVerbs) {
            return disallowedActionVerbs(List.of(disallowedActionVerbs));
        }

        public Builder enableAsyncOperation(@Nullable Output<Boolean> enableAsyncOperation) {
            $.enableAsyncOperation = enableAsyncOperation;
            return this;
        }

        public Builder enableAsyncOperation(Boolean enableAsyncOperation) {
            return enableAsyncOperation(Output.of(enableAsyncOperation));
        }

        public Builder enableThirdPartyS2S(@Nullable Output<Boolean> enableThirdPartyS2S) {
            $.enableThirdPartyS2S = enableThirdPartyS2S;
            return this;
        }

        public Builder enableThirdPartyS2S(Boolean enableThirdPartyS2S) {
            return enableThirdPartyS2S(Output.of(enableThirdPartyS2S));
        }

        public Builder endpoints(@Nullable Output<List<ResourceTypeEndpointArgs>> endpoints) {
            $.endpoints = endpoints;
            return this;
        }

        public Builder endpoints(List<ResourceTypeEndpointArgs> endpoints) {
            return endpoints(Output.of(endpoints));
        }

        public Builder endpoints(ResourceTypeEndpointArgs... endpoints) {
            return endpoints(List.of(endpoints));
        }

        public Builder extendedLocations(@Nullable Output<List<ExtendedLocationOptionsArgs>> extendedLocations) {
            $.extendedLocations = extendedLocations;
            return this;
        }

        public Builder extendedLocations(List<ExtendedLocationOptionsArgs> extendedLocations) {
            return extendedLocations(Output.of(extendedLocations));
        }

        public Builder extendedLocations(ExtendedLocationOptionsArgs... extendedLocations) {
            return extendedLocations(List.of(extendedLocations));
        }

        public Builder extensionOptions(@Nullable Output<ResourceTypeRegistrationPropertiesExtensionOptionsArgs> extensionOptions) {
            $.extensionOptions = extensionOptions;
            return this;
        }

        public Builder extensionOptions(ResourceTypeRegistrationPropertiesExtensionOptionsArgs extensionOptions) {
            return extensionOptions(Output.of(extensionOptions));
        }

        public Builder featuresRule(@Nullable Output<ResourceTypeRegistrationPropertiesFeaturesRuleArgs> featuresRule) {
            $.featuresRule = featuresRule;
            return this;
        }

        public Builder featuresRule(ResourceTypeRegistrationPropertiesFeaturesRuleArgs featuresRule) {
            return featuresRule(Output.of(featuresRule));
        }

        public Builder identityManagement(@Nullable Output<ResourceTypeRegistrationPropertiesIdentityManagementArgs> identityManagement) {
            $.identityManagement = identityManagement;
            return this;
        }

        public Builder identityManagement(ResourceTypeRegistrationPropertiesIdentityManagementArgs identityManagement) {
            return identityManagement(Output.of(identityManagement));
        }

        public Builder isPureProxy(@Nullable Output<Boolean> isPureProxy) {
            $.isPureProxy = isPureProxy;
            return this;
        }

        public Builder isPureProxy(Boolean isPureProxy) {
            return isPureProxy(Output.of(isPureProxy));
        }

        public Builder linkedAccessChecks(@Nullable Output<List<LinkedAccessCheckArgs>> linkedAccessChecks) {
            $.linkedAccessChecks = linkedAccessChecks;
            return this;
        }

        public Builder linkedAccessChecks(List<LinkedAccessCheckArgs> linkedAccessChecks) {
            return linkedAccessChecks(Output.of(linkedAccessChecks));
        }

        public Builder linkedAccessChecks(LinkedAccessCheckArgs... linkedAccessChecks) {
            return linkedAccessChecks(List.of(linkedAccessChecks));
        }

        public Builder loggingRules(@Nullable Output<List<LoggingRuleArgs>> loggingRules) {
            $.loggingRules = loggingRules;
            return this;
        }

        public Builder loggingRules(List<LoggingRuleArgs> loggingRules) {
            return loggingRules(Output.of(loggingRules));
        }

        public Builder loggingRules(LoggingRuleArgs... loggingRules) {
            return loggingRules(List.of(loggingRules));
        }

        public Builder marketplaceType(@Nullable Output<String> marketplaceType) {
            $.marketplaceType = marketplaceType;
            return this;
        }

        public Builder marketplaceType(String marketplaceType) {
            return marketplaceType(Output.of(marketplaceType));
        }

        public Builder provisioningState(@Nullable Output<Either<String,ProvisioningState>> provisioningState) {
            $.provisioningState = provisioningState;
            return this;
        }

        public Builder provisioningState(Either<String,ProvisioningState> provisioningState) {
            return provisioningState(Output.of(provisioningState));
        }

        public Builder provisioningState(String provisioningState) {
            return provisioningState(Either.ofLeft(provisioningState));
        }

        public Builder provisioningState(ProvisioningState provisioningState) {
            return provisioningState(Either.ofRight(provisioningState));
        }

        public Builder regionality(@Nullable Output<Either<String,Regionality>> regionality) {
            $.regionality = regionality;
            return this;
        }

        public Builder regionality(Either<String,Regionality> regionality) {
            return regionality(Output.of(regionality));
        }

        public Builder regionality(String regionality) {
            return regionality(Either.ofLeft(regionality));
        }

        public Builder regionality(Regionality regionality) {
            return regionality(Either.ofRight(regionality));
        }

        public Builder requestHeaderOptions(@Nullable Output<ResourceTypeRegistrationPropertiesRequestHeaderOptionsArgs> requestHeaderOptions) {
            $.requestHeaderOptions = requestHeaderOptions;
            return this;
        }

        public Builder requestHeaderOptions(ResourceTypeRegistrationPropertiesRequestHeaderOptionsArgs requestHeaderOptions) {
            return requestHeaderOptions(Output.of(requestHeaderOptions));
        }

        public Builder requiredFeatures(@Nullable Output<List<String>> requiredFeatures) {
            $.requiredFeatures = requiredFeatures;
            return this;
        }

        public Builder requiredFeatures(List<String> requiredFeatures) {
            return requiredFeatures(Output.of(requiredFeatures));
        }

        public Builder requiredFeatures(String... requiredFeatures) {
            return requiredFeatures(List.of(requiredFeatures));
        }

        public Builder resourceDeletionPolicy(@Nullable Output<Either<String,ResourceDeletionPolicy>> resourceDeletionPolicy) {
            $.resourceDeletionPolicy = resourceDeletionPolicy;
            return this;
        }

        public Builder resourceDeletionPolicy(Either<String,ResourceDeletionPolicy> resourceDeletionPolicy) {
            return resourceDeletionPolicy(Output.of(resourceDeletionPolicy));
        }

        public Builder resourceDeletionPolicy(String resourceDeletionPolicy) {
            return resourceDeletionPolicy(Either.ofLeft(resourceDeletionPolicy));
        }

        public Builder resourceDeletionPolicy(ResourceDeletionPolicy resourceDeletionPolicy) {
            return resourceDeletionPolicy(Either.ofRight(resourceDeletionPolicy));
        }

        public Builder resourceMovePolicy(@Nullable Output<ResourceTypeRegistrationPropertiesResourceMovePolicyArgs> resourceMovePolicy) {
            $.resourceMovePolicy = resourceMovePolicy;
            return this;
        }

        public Builder resourceMovePolicy(ResourceTypeRegistrationPropertiesResourceMovePolicyArgs resourceMovePolicy) {
            return resourceMovePolicy(Output.of(resourceMovePolicy));
        }

        public Builder routingType(@Nullable Output<Either<String,RoutingType>> routingType) {
            $.routingType = routingType;
            return this;
        }

        public Builder routingType(Either<String,RoutingType> routingType) {
            return routingType(Output.of(routingType));
        }

        public Builder routingType(String routingType) {
            return routingType(Either.ofLeft(routingType));
        }

        public Builder routingType(RoutingType routingType) {
            return routingType(Either.ofRight(routingType));
        }

        public Builder serviceTreeInfos(@Nullable Output<List<ServiceTreeInfoArgs>> serviceTreeInfos) {
            $.serviceTreeInfos = serviceTreeInfos;
            return this;
        }

        public Builder serviceTreeInfos(List<ServiceTreeInfoArgs> serviceTreeInfos) {
            return serviceTreeInfos(Output.of(serviceTreeInfos));
        }

        public Builder serviceTreeInfos(ServiceTreeInfoArgs... serviceTreeInfos) {
            return serviceTreeInfos(List.of(serviceTreeInfos));
        }

        public Builder subscriptionLifecycleNotificationSpecifications(@Nullable Output<ResourceTypeRegistrationPropertiesSubscriptionLifecycleNotificationSpecificationsArgs> subscriptionLifecycleNotificationSpecifications) {
            $.subscriptionLifecycleNotificationSpecifications = subscriptionLifecycleNotificationSpecifications;
            return this;
        }

        public Builder subscriptionLifecycleNotificationSpecifications(ResourceTypeRegistrationPropertiesSubscriptionLifecycleNotificationSpecificationsArgs subscriptionLifecycleNotificationSpecifications) {
            return subscriptionLifecycleNotificationSpecifications(Output.of(subscriptionLifecycleNotificationSpecifications));
        }

        public Builder subscriptionStateRules(@Nullable Output<List<SubscriptionStateRuleArgs>> subscriptionStateRules) {
            $.subscriptionStateRules = subscriptionStateRules;
            return this;
        }

        public Builder subscriptionStateRules(List<SubscriptionStateRuleArgs> subscriptionStateRules) {
            return subscriptionStateRules(Output.of(subscriptionStateRules));
        }

        public Builder subscriptionStateRules(SubscriptionStateRuleArgs... subscriptionStateRules) {
            return subscriptionStateRules(List.of(subscriptionStateRules));
        }

        public Builder swaggerSpecifications(@Nullable Output<List<SwaggerSpecificationArgs>> swaggerSpecifications) {
            $.swaggerSpecifications = swaggerSpecifications;
            return this;
        }

        public Builder swaggerSpecifications(List<SwaggerSpecificationArgs> swaggerSpecifications) {
            return swaggerSpecifications(Output.of(swaggerSpecifications));
        }

        public Builder swaggerSpecifications(SwaggerSpecificationArgs... swaggerSpecifications) {
            return swaggerSpecifications(List.of(swaggerSpecifications));
        }

        public Builder templateDeploymentOptions(@Nullable Output<ResourceTypeRegistrationPropertiesTemplateDeploymentOptionsArgs> templateDeploymentOptions) {
            $.templateDeploymentOptions = templateDeploymentOptions;
            return this;
        }

        public Builder templateDeploymentOptions(ResourceTypeRegistrationPropertiesTemplateDeploymentOptionsArgs templateDeploymentOptions) {
            return templateDeploymentOptions(Output.of(templateDeploymentOptions));
        }

        public Builder throttlingRules(@Nullable Output<List<ThrottlingRuleArgs>> throttlingRules) {
            $.throttlingRules = throttlingRules;
            return this;
        }

        public Builder throttlingRules(List<ThrottlingRuleArgs> throttlingRules) {
            return throttlingRules(Output.of(throttlingRules));
        }

        public Builder throttlingRules(ThrottlingRuleArgs... throttlingRules) {
            return throttlingRules(List.of(throttlingRules));
        }

        public ResourceTypeRegistrationPropertiesArgs build() {
            return $;
        }
    }

}
