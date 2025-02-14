// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.desktopvirtualization.outputs;

import com.pulumi.azurenative.desktopvirtualization.outputs.MigrationRequestPropertiesResponse;
import com.pulumi.azurenative.desktopvirtualization.outputs.RegistrationInfoResponse;
import com.pulumi.azurenative.desktopvirtualization.outputs.ResourceModelWithAllowedPropertySetResponseIdentity;
import com.pulumi.azurenative.desktopvirtualization.outputs.ResourceModelWithAllowedPropertySetResponsePlan;
import com.pulumi.azurenative.desktopvirtualization.outputs.ResourceModelWithAllowedPropertySetResponseSku;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetHostPoolResult {
    /**
     * @return List of applicationGroup links.
     * 
     */
    private final List<String> applicationGroupReferences;
    /**
     * @return Is cloud pc resource.
     * 
     */
    private final Boolean cloudPcResource;
    /**
     * @return Custom rdp property of HostPool.
     * 
     */
    private final @Nullable String customRdpProperty;
    /**
     * @return Description of HostPool.
     * 
     */
    private final @Nullable String description;
    /**
     * @return The etag field is *not* required. If it is provided in the response body, it must also be provided as a header per the normal etag convention.  Entity tags are used for comparing two or more entities from the same requested resource. HTTP/1.1 uses entity tags in the etag (section 14.19), If-Match (section 14.24), If-None-Match (section 14.26), and If-Range (section 14.27) header fields.
     * 
     */
    private final String etag;
    /**
     * @return Friendly name of HostPool.
     * 
     */
    private final @Nullable String friendlyName;
    /**
     * @return HostPool type for desktop.
     * 
     */
    private final String hostPoolType;
    /**
     * @return Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    private final String id;
    private final @Nullable ResourceModelWithAllowedPropertySetResponseIdentity identity;
    /**
     * @return Metadata used by portal/tooling/etc to render different UX experiences for resources of the same type; e.g. ApiApps are a kind of Microsoft.Web/sites type.  If supported, the resource provider must validate and persist this value.
     * 
     */
    private final @Nullable String kind;
    /**
     * @return The type of the load balancer.
     * 
     */
    private final String loadBalancerType;
    /**
     * @return The geo-location where the resource lives
     * 
     */
    private final @Nullable String location;
    /**
     * @return The fully qualified resource ID of the resource that manages this resource. Indicates if this resource is managed by another Azure resource. If this is present, complete mode deployment will not delete the resource if it is removed from the template since it is managed by another resource.
     * 
     */
    private final @Nullable String managedBy;
    /**
     * @return The max session limit of HostPool.
     * 
     */
    private final @Nullable Integer maxSessionLimit;
    /**
     * @return The registration info of HostPool.
     * 
     */
    private final @Nullable MigrationRequestPropertiesResponse migrationRequest;
    /**
     * @return The name of the resource
     * 
     */
    private final String name;
    /**
     * @return ObjectId of HostPool. (internal use)
     * 
     */
    private final String objectId;
    /**
     * @return PersonalDesktopAssignment type for HostPool.
     * 
     */
    private final @Nullable String personalDesktopAssignmentType;
    private final @Nullable ResourceModelWithAllowedPropertySetResponsePlan plan;
    /**
     * @return The type of preferred application group type, default to Desktop Application Group
     * 
     */
    private final String preferredAppGroupType;
    /**
     * @return The registration info of HostPool.
     * 
     */
    private final @Nullable RegistrationInfoResponse registrationInfo;
    /**
     * @return The ring number of HostPool.
     * 
     */
    private final @Nullable Integer ring;
    private final @Nullable ResourceModelWithAllowedPropertySetResponseSku sku;
    /**
     * @return ClientId for the registered Relying Party used to issue WVD SSO certificates.
     * 
     */
    private final @Nullable String ssoClientId;
    /**
     * @return Path to Azure KeyVault storing the secret used for communication to ADFS.
     * 
     */
    private final @Nullable String ssoClientSecretKeyVaultPath;
    /**
     * @return The type of single sign on Secret Type.
     * 
     */
    private final @Nullable String ssoSecretType;
    /**
     * @return URL to customer ADFS server for signing WVD SSO certificates.
     * 
     */
    private final @Nullable String ssoadfsAuthority;
    /**
     * @return The flag to turn on/off StartVMOnConnect feature.
     * 
     */
    private final @Nullable Boolean startVMOnConnect;
    /**
     * @return Resource tags.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * @return The type of the resource. E.g. &#34;Microsoft.Compute/virtualMachines&#34; or &#34;Microsoft.Storage/storageAccounts&#34;
     * 
     */
    private final String type;
    /**
     * @return Is validation environment.
     * 
     */
    private final @Nullable Boolean validationEnvironment;
    /**
     * @return VM template for sessionhosts configuration within hostpool.
     * 
     */
    private final @Nullable String vmTemplate;

    @CustomType.Constructor
    private GetHostPoolResult(
        @CustomType.Parameter("applicationGroupReferences") List<String> applicationGroupReferences,
        @CustomType.Parameter("cloudPcResource") Boolean cloudPcResource,
        @CustomType.Parameter("customRdpProperty") @Nullable String customRdpProperty,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("etag") String etag,
        @CustomType.Parameter("friendlyName") @Nullable String friendlyName,
        @CustomType.Parameter("hostPoolType") String hostPoolType,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("identity") @Nullable ResourceModelWithAllowedPropertySetResponseIdentity identity,
        @CustomType.Parameter("kind") @Nullable String kind,
        @CustomType.Parameter("loadBalancerType") String loadBalancerType,
        @CustomType.Parameter("location") @Nullable String location,
        @CustomType.Parameter("managedBy") @Nullable String managedBy,
        @CustomType.Parameter("maxSessionLimit") @Nullable Integer maxSessionLimit,
        @CustomType.Parameter("migrationRequest") @Nullable MigrationRequestPropertiesResponse migrationRequest,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("objectId") String objectId,
        @CustomType.Parameter("personalDesktopAssignmentType") @Nullable String personalDesktopAssignmentType,
        @CustomType.Parameter("plan") @Nullable ResourceModelWithAllowedPropertySetResponsePlan plan,
        @CustomType.Parameter("preferredAppGroupType") String preferredAppGroupType,
        @CustomType.Parameter("registrationInfo") @Nullable RegistrationInfoResponse registrationInfo,
        @CustomType.Parameter("ring") @Nullable Integer ring,
        @CustomType.Parameter("sku") @Nullable ResourceModelWithAllowedPropertySetResponseSku sku,
        @CustomType.Parameter("ssoClientId") @Nullable String ssoClientId,
        @CustomType.Parameter("ssoClientSecretKeyVaultPath") @Nullable String ssoClientSecretKeyVaultPath,
        @CustomType.Parameter("ssoSecretType") @Nullable String ssoSecretType,
        @CustomType.Parameter("ssoadfsAuthority") @Nullable String ssoadfsAuthority,
        @CustomType.Parameter("startVMOnConnect") @Nullable Boolean startVMOnConnect,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("validationEnvironment") @Nullable Boolean validationEnvironment,
        @CustomType.Parameter("vmTemplate") @Nullable String vmTemplate) {
        this.applicationGroupReferences = applicationGroupReferences;
        this.cloudPcResource = cloudPcResource;
        this.customRdpProperty = customRdpProperty;
        this.description = description;
        this.etag = etag;
        this.friendlyName = friendlyName;
        this.hostPoolType = hostPoolType;
        this.id = id;
        this.identity = identity;
        this.kind = kind;
        this.loadBalancerType = loadBalancerType;
        this.location = location;
        this.managedBy = managedBy;
        this.maxSessionLimit = maxSessionLimit;
        this.migrationRequest = migrationRequest;
        this.name = name;
        this.objectId = objectId;
        this.personalDesktopAssignmentType = personalDesktopAssignmentType;
        this.plan = plan;
        this.preferredAppGroupType = preferredAppGroupType;
        this.registrationInfo = registrationInfo;
        this.ring = ring;
        this.sku = sku;
        this.ssoClientId = ssoClientId;
        this.ssoClientSecretKeyVaultPath = ssoClientSecretKeyVaultPath;
        this.ssoSecretType = ssoSecretType;
        this.ssoadfsAuthority = ssoadfsAuthority;
        this.startVMOnConnect = startVMOnConnect;
        this.tags = tags;
        this.type = type;
        this.validationEnvironment = validationEnvironment;
        this.vmTemplate = vmTemplate;
    }

    /**
     * @return List of applicationGroup links.
     * 
     */
    public List<String> applicationGroupReferences() {
        return this.applicationGroupReferences;
    }
    /**
     * @return Is cloud pc resource.
     * 
     */
    public Boolean cloudPcResource() {
        return this.cloudPcResource;
    }
    /**
     * @return Custom rdp property of HostPool.
     * 
     */
    public Optional<String> customRdpProperty() {
        return Optional.ofNullable(this.customRdpProperty);
    }
    /**
     * @return Description of HostPool.
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * @return The etag field is *not* required. If it is provided in the response body, it must also be provided as a header per the normal etag convention.  Entity tags are used for comparing two or more entities from the same requested resource. HTTP/1.1 uses entity tags in the etag (section 14.19), If-Match (section 14.24), If-None-Match (section 14.26), and If-Range (section 14.27) header fields.
     * 
     */
    public String etag() {
        return this.etag;
    }
    /**
     * @return Friendly name of HostPool.
     * 
     */
    public Optional<String> friendlyName() {
        return Optional.ofNullable(this.friendlyName);
    }
    /**
     * @return HostPool type for desktop.
     * 
     */
    public String hostPoolType() {
        return this.hostPoolType;
    }
    /**
     * @return Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    public String id() {
        return this.id;
    }
    public Optional<ResourceModelWithAllowedPropertySetResponseIdentity> identity() {
        return Optional.ofNullable(this.identity);
    }
    /**
     * @return Metadata used by portal/tooling/etc to render different UX experiences for resources of the same type; e.g. ApiApps are a kind of Microsoft.Web/sites type.  If supported, the resource provider must validate and persist this value.
     * 
     */
    public Optional<String> kind() {
        return Optional.ofNullable(this.kind);
    }
    /**
     * @return The type of the load balancer.
     * 
     */
    public String loadBalancerType() {
        return this.loadBalancerType;
    }
    /**
     * @return The geo-location where the resource lives
     * 
     */
    public Optional<String> location() {
        return Optional.ofNullable(this.location);
    }
    /**
     * @return The fully qualified resource ID of the resource that manages this resource. Indicates if this resource is managed by another Azure resource. If this is present, complete mode deployment will not delete the resource if it is removed from the template since it is managed by another resource.
     * 
     */
    public Optional<String> managedBy() {
        return Optional.ofNullable(this.managedBy);
    }
    /**
     * @return The max session limit of HostPool.
     * 
     */
    public Optional<Integer> maxSessionLimit() {
        return Optional.ofNullable(this.maxSessionLimit);
    }
    /**
     * @return The registration info of HostPool.
     * 
     */
    public Optional<MigrationRequestPropertiesResponse> migrationRequest() {
        return Optional.ofNullable(this.migrationRequest);
    }
    /**
     * @return The name of the resource
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return ObjectId of HostPool. (internal use)
     * 
     */
    public String objectId() {
        return this.objectId;
    }
    /**
     * @return PersonalDesktopAssignment type for HostPool.
     * 
     */
    public Optional<String> personalDesktopAssignmentType() {
        return Optional.ofNullable(this.personalDesktopAssignmentType);
    }
    public Optional<ResourceModelWithAllowedPropertySetResponsePlan> plan() {
        return Optional.ofNullable(this.plan);
    }
    /**
     * @return The type of preferred application group type, default to Desktop Application Group
     * 
     */
    public String preferredAppGroupType() {
        return this.preferredAppGroupType;
    }
    /**
     * @return The registration info of HostPool.
     * 
     */
    public Optional<RegistrationInfoResponse> registrationInfo() {
        return Optional.ofNullable(this.registrationInfo);
    }
    /**
     * @return The ring number of HostPool.
     * 
     */
    public Optional<Integer> ring() {
        return Optional.ofNullable(this.ring);
    }
    public Optional<ResourceModelWithAllowedPropertySetResponseSku> sku() {
        return Optional.ofNullable(this.sku);
    }
    /**
     * @return ClientId for the registered Relying Party used to issue WVD SSO certificates.
     * 
     */
    public Optional<String> ssoClientId() {
        return Optional.ofNullable(this.ssoClientId);
    }
    /**
     * @return Path to Azure KeyVault storing the secret used for communication to ADFS.
     * 
     */
    public Optional<String> ssoClientSecretKeyVaultPath() {
        return Optional.ofNullable(this.ssoClientSecretKeyVaultPath);
    }
    /**
     * @return The type of single sign on Secret Type.
     * 
     */
    public Optional<String> ssoSecretType() {
        return Optional.ofNullable(this.ssoSecretType);
    }
    /**
     * @return URL to customer ADFS server for signing WVD SSO certificates.
     * 
     */
    public Optional<String> ssoadfsAuthority() {
        return Optional.ofNullable(this.ssoadfsAuthority);
    }
    /**
     * @return The flag to turn on/off StartVMOnConnect feature.
     * 
     */
    public Optional<Boolean> startVMOnConnect() {
        return Optional.ofNullable(this.startVMOnConnect);
    }
    /**
     * @return Resource tags.
     * 
     */
    public Map<String,String> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * @return The type of the resource. E.g. &#34;Microsoft.Compute/virtualMachines&#34; or &#34;Microsoft.Storage/storageAccounts&#34;
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return Is validation environment.
     * 
     */
    public Optional<Boolean> validationEnvironment() {
        return Optional.ofNullable(this.validationEnvironment);
    }
    /**
     * @return VM template for sessionhosts configuration within hostpool.
     * 
     */
    public Optional<String> vmTemplate() {
        return Optional.ofNullable(this.vmTemplate);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetHostPoolResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> applicationGroupReferences;
        private Boolean cloudPcResource;
        private @Nullable String customRdpProperty;
        private @Nullable String description;
        private String etag;
        private @Nullable String friendlyName;
        private String hostPoolType;
        private String id;
        private @Nullable ResourceModelWithAllowedPropertySetResponseIdentity identity;
        private @Nullable String kind;
        private String loadBalancerType;
        private @Nullable String location;
        private @Nullable String managedBy;
        private @Nullable Integer maxSessionLimit;
        private @Nullable MigrationRequestPropertiesResponse migrationRequest;
        private String name;
        private String objectId;
        private @Nullable String personalDesktopAssignmentType;
        private @Nullable ResourceModelWithAllowedPropertySetResponsePlan plan;
        private String preferredAppGroupType;
        private @Nullable RegistrationInfoResponse registrationInfo;
        private @Nullable Integer ring;
        private @Nullable ResourceModelWithAllowedPropertySetResponseSku sku;
        private @Nullable String ssoClientId;
        private @Nullable String ssoClientSecretKeyVaultPath;
        private @Nullable String ssoSecretType;
        private @Nullable String ssoadfsAuthority;
        private @Nullable Boolean startVMOnConnect;
        private @Nullable Map<String,String> tags;
        private String type;
        private @Nullable Boolean validationEnvironment;
        private @Nullable String vmTemplate;

        public Builder() {
    	      // Empty
        }

        public Builder(GetHostPoolResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationGroupReferences = defaults.applicationGroupReferences;
    	      this.cloudPcResource = defaults.cloudPcResource;
    	      this.customRdpProperty = defaults.customRdpProperty;
    	      this.description = defaults.description;
    	      this.etag = defaults.etag;
    	      this.friendlyName = defaults.friendlyName;
    	      this.hostPoolType = defaults.hostPoolType;
    	      this.id = defaults.id;
    	      this.identity = defaults.identity;
    	      this.kind = defaults.kind;
    	      this.loadBalancerType = defaults.loadBalancerType;
    	      this.location = defaults.location;
    	      this.managedBy = defaults.managedBy;
    	      this.maxSessionLimit = defaults.maxSessionLimit;
    	      this.migrationRequest = defaults.migrationRequest;
    	      this.name = defaults.name;
    	      this.objectId = defaults.objectId;
    	      this.personalDesktopAssignmentType = defaults.personalDesktopAssignmentType;
    	      this.plan = defaults.plan;
    	      this.preferredAppGroupType = defaults.preferredAppGroupType;
    	      this.registrationInfo = defaults.registrationInfo;
    	      this.ring = defaults.ring;
    	      this.sku = defaults.sku;
    	      this.ssoClientId = defaults.ssoClientId;
    	      this.ssoClientSecretKeyVaultPath = defaults.ssoClientSecretKeyVaultPath;
    	      this.ssoSecretType = defaults.ssoSecretType;
    	      this.ssoadfsAuthority = defaults.ssoadfsAuthority;
    	      this.startVMOnConnect = defaults.startVMOnConnect;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
    	      this.validationEnvironment = defaults.validationEnvironment;
    	      this.vmTemplate = defaults.vmTemplate;
        }

        public Builder applicationGroupReferences(List<String> applicationGroupReferences) {
            this.applicationGroupReferences = Objects.requireNonNull(applicationGroupReferences);
            return this;
        }
        public Builder applicationGroupReferences(String... applicationGroupReferences) {
            return applicationGroupReferences(List.of(applicationGroupReferences));
        }
        public Builder cloudPcResource(Boolean cloudPcResource) {
            this.cloudPcResource = Objects.requireNonNull(cloudPcResource);
            return this;
        }
        public Builder customRdpProperty(@Nullable String customRdpProperty) {
            this.customRdpProperty = customRdpProperty;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder etag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }
        public Builder friendlyName(@Nullable String friendlyName) {
            this.friendlyName = friendlyName;
            return this;
        }
        public Builder hostPoolType(String hostPoolType) {
            this.hostPoolType = Objects.requireNonNull(hostPoolType);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder identity(@Nullable ResourceModelWithAllowedPropertySetResponseIdentity identity) {
            this.identity = identity;
            return this;
        }
        public Builder kind(@Nullable String kind) {
            this.kind = kind;
            return this;
        }
        public Builder loadBalancerType(String loadBalancerType) {
            this.loadBalancerType = Objects.requireNonNull(loadBalancerType);
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = location;
            return this;
        }
        public Builder managedBy(@Nullable String managedBy) {
            this.managedBy = managedBy;
            return this;
        }
        public Builder maxSessionLimit(@Nullable Integer maxSessionLimit) {
            this.maxSessionLimit = maxSessionLimit;
            return this;
        }
        public Builder migrationRequest(@Nullable MigrationRequestPropertiesResponse migrationRequest) {
            this.migrationRequest = migrationRequest;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder objectId(String objectId) {
            this.objectId = Objects.requireNonNull(objectId);
            return this;
        }
        public Builder personalDesktopAssignmentType(@Nullable String personalDesktopAssignmentType) {
            this.personalDesktopAssignmentType = personalDesktopAssignmentType;
            return this;
        }
        public Builder plan(@Nullable ResourceModelWithAllowedPropertySetResponsePlan plan) {
            this.plan = plan;
            return this;
        }
        public Builder preferredAppGroupType(String preferredAppGroupType) {
            this.preferredAppGroupType = Objects.requireNonNull(preferredAppGroupType);
            return this;
        }
        public Builder registrationInfo(@Nullable RegistrationInfoResponse registrationInfo) {
            this.registrationInfo = registrationInfo;
            return this;
        }
        public Builder ring(@Nullable Integer ring) {
            this.ring = ring;
            return this;
        }
        public Builder sku(@Nullable ResourceModelWithAllowedPropertySetResponseSku sku) {
            this.sku = sku;
            return this;
        }
        public Builder ssoClientId(@Nullable String ssoClientId) {
            this.ssoClientId = ssoClientId;
            return this;
        }
        public Builder ssoClientSecretKeyVaultPath(@Nullable String ssoClientSecretKeyVaultPath) {
            this.ssoClientSecretKeyVaultPath = ssoClientSecretKeyVaultPath;
            return this;
        }
        public Builder ssoSecretType(@Nullable String ssoSecretType) {
            this.ssoSecretType = ssoSecretType;
            return this;
        }
        public Builder ssoadfsAuthority(@Nullable String ssoadfsAuthority) {
            this.ssoadfsAuthority = ssoadfsAuthority;
            return this;
        }
        public Builder startVMOnConnect(@Nullable Boolean startVMOnConnect) {
            this.startVMOnConnect = startVMOnConnect;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder validationEnvironment(@Nullable Boolean validationEnvironment) {
            this.validationEnvironment = validationEnvironment;
            return this;
        }
        public Builder vmTemplate(@Nullable String vmTemplate) {
            this.vmTemplate = vmTemplate;
            return this;
        }        public GetHostPoolResult build() {
            return new GetHostPoolResult(applicationGroupReferences, cloudPcResource, customRdpProperty, description, etag, friendlyName, hostPoolType, id, identity, kind, loadBalancerType, location, managedBy, maxSessionLimit, migrationRequest, name, objectId, personalDesktopAssignmentType, plan, preferredAppGroupType, registrationInfo, ring, sku, ssoClientId, ssoClientSecretKeyVaultPath, ssoSecretType, ssoadfsAuthority, startVMOnConnect, tags, type, validationEnvironment, vmTemplate);
        }
    }
}
