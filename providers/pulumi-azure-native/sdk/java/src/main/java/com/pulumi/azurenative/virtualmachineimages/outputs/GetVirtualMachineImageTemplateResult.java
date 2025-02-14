// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.virtualmachineimages.outputs;

import com.pulumi.azurenative.virtualmachineimages.outputs.ImageTemplateFileCustomizerResponse;
import com.pulumi.azurenative.virtualmachineimages.outputs.ImageTemplateIdentityResponse;
import com.pulumi.azurenative.virtualmachineimages.outputs.ImageTemplateLastRunStatusResponse;
import com.pulumi.azurenative.virtualmachineimages.outputs.ImageTemplateManagedImageDistributorResponse;
import com.pulumi.azurenative.virtualmachineimages.outputs.ImageTemplateManagedImageSourceResponse;
import com.pulumi.azurenative.virtualmachineimages.outputs.ImageTemplatePlatformImageSourceResponse;
import com.pulumi.azurenative.virtualmachineimages.outputs.ImageTemplatePowerShellCustomizerResponse;
import com.pulumi.azurenative.virtualmachineimages.outputs.ImageTemplateRestartCustomizerResponse;
import com.pulumi.azurenative.virtualmachineimages.outputs.ImageTemplateSharedImageDistributorResponse;
import com.pulumi.azurenative.virtualmachineimages.outputs.ImageTemplateSharedImageVersionSourceResponse;
import com.pulumi.azurenative.virtualmachineimages.outputs.ImageTemplateShellCustomizerResponse;
import com.pulumi.azurenative.virtualmachineimages.outputs.ImageTemplateVhdDistributorResponse;
import com.pulumi.azurenative.virtualmachineimages.outputs.ImageTemplateVmProfileResponse;
import com.pulumi.azurenative.virtualmachineimages.outputs.ImageTemplateWindowsUpdateCustomizerResponse;
import com.pulumi.azurenative.virtualmachineimages.outputs.ProvisioningErrorResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetVirtualMachineImageTemplateResult {
    /**
     * @return Maximum duration to wait while building the image template. Omit or specify 0 to use the default (4 hours).
     * 
     */
    private final @Nullable Integer buildTimeoutInMinutes;
    /**
     * @return Specifies the properties used to describe the customization steps of the image, like Image source etc
     * 
     */
    private final @Nullable List<Object> customize;
    /**
     * @return The distribution targets where the image output needs to go to.
     * 
     */
    private final List<Object> distribute;
    /**
     * @return Resource Id
     * 
     */
    private final String id;
    /**
     * @return The identity of the image template, if configured.
     * 
     */
    private final ImageTemplateIdentityResponse identity;
    /**
     * @return State of &#39;run&#39; that is currently executing or was last executed.
     * 
     */
    private final ImageTemplateLastRunStatusResponse lastRunStatus;
    /**
     * @return Resource location
     * 
     */
    private final String location;
    /**
     * @return Resource name
     * 
     */
    private final String name;
    /**
     * @return Provisioning error, if any
     * 
     */
    private final ProvisioningErrorResponse provisioningError;
    /**
     * @return Provisioning state of the resource
     * 
     */
    private final String provisioningState;
    /**
     * @return Specifies the properties used to describe the source image.
     * 
     */
    private final Object source;
    /**
     * @return Resource tags
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * @return Resource type
     * 
     */
    private final String type;
    /**
     * @return Describes how virtual machine is set up to build images
     * 
     */
    private final @Nullable ImageTemplateVmProfileResponse vmProfile;

    @CustomType.Constructor
    private GetVirtualMachineImageTemplateResult(
        @CustomType.Parameter("buildTimeoutInMinutes") @Nullable Integer buildTimeoutInMinutes,
        @CustomType.Parameter("customize") @Nullable List<Object> customize,
        @CustomType.Parameter("distribute") List<Object> distribute,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("identity") ImageTemplateIdentityResponse identity,
        @CustomType.Parameter("lastRunStatus") ImageTemplateLastRunStatusResponse lastRunStatus,
        @CustomType.Parameter("location") String location,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("provisioningError") ProvisioningErrorResponse provisioningError,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("source") Object source,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("vmProfile") @Nullable ImageTemplateVmProfileResponse vmProfile) {
        this.buildTimeoutInMinutes = buildTimeoutInMinutes;
        this.customize = customize;
        this.distribute = distribute;
        this.id = id;
        this.identity = identity;
        this.lastRunStatus = lastRunStatus;
        this.location = location;
        this.name = name;
        this.provisioningError = provisioningError;
        this.provisioningState = provisioningState;
        this.source = source;
        this.tags = tags;
        this.type = type;
        this.vmProfile = vmProfile;
    }

    /**
     * @return Maximum duration to wait while building the image template. Omit or specify 0 to use the default (4 hours).
     * 
     */
    public Optional<Integer> buildTimeoutInMinutes() {
        return Optional.ofNullable(this.buildTimeoutInMinutes);
    }
    /**
     * @return Specifies the properties used to describe the customization steps of the image, like Image source etc
     * 
     */
    public List<Object> customize() {
        return this.customize == null ? List.of() : this.customize;
    }
    /**
     * @return The distribution targets where the image output needs to go to.
     * 
     */
    public List<Object> distribute() {
        return this.distribute;
    }
    /**
     * @return Resource Id
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The identity of the image template, if configured.
     * 
     */
    public ImageTemplateIdentityResponse identity() {
        return this.identity;
    }
    /**
     * @return State of &#39;run&#39; that is currently executing or was last executed.
     * 
     */
    public ImageTemplateLastRunStatusResponse lastRunStatus() {
        return this.lastRunStatus;
    }
    /**
     * @return Resource location
     * 
     */
    public String location() {
        return this.location;
    }
    /**
     * @return Resource name
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Provisioning error, if any
     * 
     */
    public ProvisioningErrorResponse provisioningError() {
        return this.provisioningError;
    }
    /**
     * @return Provisioning state of the resource
     * 
     */
    public String provisioningState() {
        return this.provisioningState;
    }
    /**
     * @return Specifies the properties used to describe the source image.
     * 
     */
    public Object source() {
        return this.source;
    }
    /**
     * @return Resource tags
     * 
     */
    public Map<String,String> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * @return Resource type
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return Describes how virtual machine is set up to build images
     * 
     */
    public Optional<ImageTemplateVmProfileResponse> vmProfile() {
        return Optional.ofNullable(this.vmProfile);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVirtualMachineImageTemplateResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer buildTimeoutInMinutes;
        private @Nullable List<Object> customize;
        private List<Object> distribute;
        private String id;
        private ImageTemplateIdentityResponse identity;
        private ImageTemplateLastRunStatusResponse lastRunStatus;
        private String location;
        private String name;
        private ProvisioningErrorResponse provisioningError;
        private String provisioningState;
        private Object source;
        private @Nullable Map<String,String> tags;
        private String type;
        private @Nullable ImageTemplateVmProfileResponse vmProfile;

        public Builder() {
    	      // Empty
        }

        public Builder(GetVirtualMachineImageTemplateResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.buildTimeoutInMinutes = defaults.buildTimeoutInMinutes;
    	      this.customize = defaults.customize;
    	      this.distribute = defaults.distribute;
    	      this.id = defaults.id;
    	      this.identity = defaults.identity;
    	      this.lastRunStatus = defaults.lastRunStatus;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.provisioningError = defaults.provisioningError;
    	      this.provisioningState = defaults.provisioningState;
    	      this.source = defaults.source;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
    	      this.vmProfile = defaults.vmProfile;
        }

        public Builder buildTimeoutInMinutes(@Nullable Integer buildTimeoutInMinutes) {
            this.buildTimeoutInMinutes = buildTimeoutInMinutes;
            return this;
        }
        public Builder customize(@Nullable List<Object> customize) {
            this.customize = customize;
            return this;
        }
        public Builder customize(Object... customize) {
            return customize(List.of(customize));
        }
        public Builder distribute(List<Object> distribute) {
            this.distribute = Objects.requireNonNull(distribute);
            return this;
        }
        public Builder distribute(Object... distribute) {
            return distribute(List.of(distribute));
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder identity(ImageTemplateIdentityResponse identity) {
            this.identity = Objects.requireNonNull(identity);
            return this;
        }
        public Builder lastRunStatus(ImageTemplateLastRunStatusResponse lastRunStatus) {
            this.lastRunStatus = Objects.requireNonNull(lastRunStatus);
            return this;
        }
        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder provisioningError(ProvisioningErrorResponse provisioningError) {
            this.provisioningError = Objects.requireNonNull(provisioningError);
            return this;
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder source(Object source) {
            this.source = Objects.requireNonNull(source);
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
        public Builder vmProfile(@Nullable ImageTemplateVmProfileResponse vmProfile) {
            this.vmProfile = vmProfile;
            return this;
        }        public GetVirtualMachineImageTemplateResult build() {
            return new GetVirtualMachineImageTemplateResult(buildTimeoutInMinutes, customize, distribute, id, identity, lastRunStatus, location, name, provisioningError, provisioningState, source, tags, type, vmProfile);
        }
    }
}
