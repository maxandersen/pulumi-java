// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.testing_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.testing_v1.outputs.FileReferenceResponse;
import com.pulumi.googlenative.testing_v1.outputs.IosDeviceFileResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class IosTestSetupResponse {
    /**
     * iOS apps to install in addition to those being directly tested.
     * 
     */
    private final List<FileReferenceResponse> additionalIpas;
    /**
     * The network traffic profile used for running the test. Available network profiles can be queried by using the NETWORK_CONFIGURATION environment type when calling TestEnvironmentDiscoveryService.GetTestEnvironmentCatalog.
     * 
     */
    private final String networkProfile;
    /**
     * List of directories on the device to upload to Cloud Storage at the end of the test. Directories should either be in a shared directory (such as /private/var/mobile/Media) or within an accessible directory inside the app's filesystem (such as /Documents) by specifying the bundle ID.
     * 
     */
    private final List<IosDeviceFileResponse> pullDirectories;
    /**
     * List of files to push to the device before starting the test.
     * 
     */
    private final List<IosDeviceFileResponse> pushFiles;

    @CustomType.Constructor
    private IosTestSetupResponse(
        @CustomType.Parameter("additionalIpas") List<FileReferenceResponse> additionalIpas,
        @CustomType.Parameter("networkProfile") String networkProfile,
        @CustomType.Parameter("pullDirectories") List<IosDeviceFileResponse> pullDirectories,
        @CustomType.Parameter("pushFiles") List<IosDeviceFileResponse> pushFiles) {
        this.additionalIpas = additionalIpas;
        this.networkProfile = networkProfile;
        this.pullDirectories = pullDirectories;
        this.pushFiles = pushFiles;
    }

    /**
     * iOS apps to install in addition to those being directly tested.
     * 
    */
    public List<FileReferenceResponse> additionalIpas() {
        return this.additionalIpas;
    }
    /**
     * The network traffic profile used for running the test. Available network profiles can be queried by using the NETWORK_CONFIGURATION environment type when calling TestEnvironmentDiscoveryService.GetTestEnvironmentCatalog.
     * 
    */
    public String networkProfile() {
        return this.networkProfile;
    }
    /**
     * List of directories on the device to upload to Cloud Storage at the end of the test. Directories should either be in a shared directory (such as /private/var/mobile/Media) or within an accessible directory inside the app's filesystem (such as /Documents) by specifying the bundle ID.
     * 
    */
    public List<IosDeviceFileResponse> pullDirectories() {
        return this.pullDirectories;
    }
    /**
     * List of files to push to the device before starting the test.
     * 
    */
    public List<IosDeviceFileResponse> pushFiles() {
        return this.pushFiles;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IosTestSetupResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<FileReferenceResponse> additionalIpas;
        private String networkProfile;
        private List<IosDeviceFileResponse> pullDirectories;
        private List<IosDeviceFileResponse> pushFiles;

        public Builder() {
    	      // Empty
        }

        public Builder(IosTestSetupResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalIpas = defaults.additionalIpas;
    	      this.networkProfile = defaults.networkProfile;
    	      this.pullDirectories = defaults.pullDirectories;
    	      this.pushFiles = defaults.pushFiles;
        }

        public Builder additionalIpas(List<FileReferenceResponse> additionalIpas) {
            this.additionalIpas = Objects.requireNonNull(additionalIpas);
            return this;
        }
        public Builder additionalIpas(FileReferenceResponse... additionalIpas) {
            return additionalIpas(List.of(additionalIpas));
        }
        public Builder networkProfile(String networkProfile) {
            this.networkProfile = Objects.requireNonNull(networkProfile);
            return this;
        }
        public Builder pullDirectories(List<IosDeviceFileResponse> pullDirectories) {
            this.pullDirectories = Objects.requireNonNull(pullDirectories);
            return this;
        }
        public Builder pullDirectories(IosDeviceFileResponse... pullDirectories) {
            return pullDirectories(List.of(pullDirectories));
        }
        public Builder pushFiles(List<IosDeviceFileResponse> pushFiles) {
            this.pushFiles = Objects.requireNonNull(pushFiles);
            return this;
        }
        public Builder pushFiles(IosDeviceFileResponse... pushFiles) {
            return pushFiles(List.of(pushFiles));
        }        public IosTestSetupResponse build() {
            return new IosTestSetupResponse(additionalIpas, networkProfile, pullDirectories, pushFiles);
        }
    }
}
