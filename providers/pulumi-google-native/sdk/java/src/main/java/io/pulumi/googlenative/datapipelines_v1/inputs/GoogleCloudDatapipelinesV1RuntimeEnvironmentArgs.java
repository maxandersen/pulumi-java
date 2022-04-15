// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datapipelines_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.datapipelines_v1.enums.GoogleCloudDatapipelinesV1RuntimeEnvironmentIpConfiguration;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The environment values to set at runtime.
 * 
 */
public final class GoogleCloudDatapipelinesV1RuntimeEnvironmentArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDatapipelinesV1RuntimeEnvironmentArgs Empty = new GoogleCloudDatapipelinesV1RuntimeEnvironmentArgs();

    /**
     * Additional experiment flags for the job.
     * 
     */
    @Import(name="additionalExperiments")
      private final @Nullable Output<List<String>> additionalExperiments;

    public Output<List<String>> additionalExperiments() {
        return this.additionalExperiments == null ? Codegen.empty() : this.additionalExperiments;
    }

    /**
     * Additional user labels to be specified for the job. Keys and values should follow the restrictions specified in the [labeling restrictions](https://cloud.google.com/compute/docs/labeling-resources#restrictions) page. An object containing a list of key/value pairs. Example: { "name": "wrench", "mass": "1kg", "count": "3" }.
     * 
     */
    @Import(name="additionalUserLabels")
      private final @Nullable Output<Map<String,String>> additionalUserLabels;

    public Output<Map<String,String>> additionalUserLabels() {
        return this.additionalUserLabels == null ? Codegen.empty() : this.additionalUserLabels;
    }

    /**
     * Whether to bypass the safety checks for the job's temporary directory. Use with caution.
     * 
     */
    @Import(name="bypassTempDirValidation")
      private final @Nullable Output<Boolean> bypassTempDirValidation;

    public Output<Boolean> bypassTempDirValidation() {
        return this.bypassTempDirValidation == null ? Codegen.empty() : this.bypassTempDirValidation;
    }

    /**
     * Whether to enable Streaming Engine for the job.
     * 
     */
    @Import(name="enableStreamingEngine")
      private final @Nullable Output<Boolean> enableStreamingEngine;

    public Output<Boolean> enableStreamingEngine() {
        return this.enableStreamingEngine == null ? Codegen.empty() : this.enableStreamingEngine;
    }

    /**
     * Configuration for VM IPs.
     * 
     */
    @Import(name="ipConfiguration")
      private final @Nullable Output<GoogleCloudDatapipelinesV1RuntimeEnvironmentIpConfiguration> ipConfiguration;

    public Output<GoogleCloudDatapipelinesV1RuntimeEnvironmentIpConfiguration> ipConfiguration() {
        return this.ipConfiguration == null ? Codegen.empty() : this.ipConfiguration;
    }

    /**
     * Name for the Cloud KMS key for the job. The key format is: projects//locations//keyRings//cryptoKeys/
     * 
     */
    @Import(name="kmsKeyName")
      private final @Nullable Output<String> kmsKeyName;

    public Output<String> kmsKeyName() {
        return this.kmsKeyName == null ? Codegen.empty() : this.kmsKeyName;
    }

    /**
     * The machine type to use for the job. Defaults to the value from the template if not specified.
     * 
     */
    @Import(name="machineType")
      private final @Nullable Output<String> machineType;

    public Output<String> machineType() {
        return this.machineType == null ? Codegen.empty() : this.machineType;
    }

    /**
     * The maximum number of Compute Engine instances to be made available to your pipeline during execution, from 1 to 1000.
     * 
     */
    @Import(name="maxWorkers")
      private final @Nullable Output<Integer> maxWorkers;

    public Output<Integer> maxWorkers() {
        return this.maxWorkers == null ? Codegen.empty() : this.maxWorkers;
    }

    /**
     * Network to which VMs will be assigned. If empty or unspecified, the service will use the network "default".
     * 
     */
    @Import(name="network")
      private final @Nullable Output<String> network;

    public Output<String> network() {
        return this.network == null ? Codegen.empty() : this.network;
    }

    /**
     * The initial number of Compute Engine instances for the job.
     * 
     */
    @Import(name="numWorkers")
      private final @Nullable Output<Integer> numWorkers;

    public Output<Integer> numWorkers() {
        return this.numWorkers == null ? Codegen.empty() : this.numWorkers;
    }

    /**
     * The email address of the service account to run the job as.
     * 
     */
    @Import(name="serviceAccountEmail")
      private final @Nullable Output<String> serviceAccountEmail;

    public Output<String> serviceAccountEmail() {
        return this.serviceAccountEmail == null ? Codegen.empty() : this.serviceAccountEmail;
    }

    /**
     * Subnetwork to which VMs will be assigned, if desired. You can specify a subnetwork using either a complete URL or an abbreviated path. Expected to be of the form "https://www.googleapis.com/compute/v1/projects/HOST_PROJECT_ID/regions/REGION/subnetworks/SUBNETWORK" or "regions/REGION/subnetworks/SUBNETWORK". If the subnetwork is located in a Shared VPC network, you must use the complete URL.
     * 
     */
    @Import(name="subnetwork")
      private final @Nullable Output<String> subnetwork;

    public Output<String> subnetwork() {
        return this.subnetwork == null ? Codegen.empty() : this.subnetwork;
    }

    /**
     * The Cloud Storage path to use for temporary files. Must be a valid Cloud Storage URL, beginning with `gs://`.
     * 
     */
    @Import(name="tempLocation")
      private final @Nullable Output<String> tempLocation;

    public Output<String> tempLocation() {
        return this.tempLocation == null ? Codegen.empty() : this.tempLocation;
    }

    /**
     * The Compute Engine region (https://cloud.google.com/compute/docs/regions-zones/regions-zones) in which worker processing should occur, e.g. "us-west1". Mutually exclusive with worker_zone. If neither worker_region nor worker_zone is specified, default to the control plane's region.
     * 
     */
    @Import(name="workerRegion")
      private final @Nullable Output<String> workerRegion;

    public Output<String> workerRegion() {
        return this.workerRegion == null ? Codegen.empty() : this.workerRegion;
    }

    /**
     * The Compute Engine zone (https://cloud.google.com/compute/docs/regions-zones/regions-zones) in which worker processing should occur, e.g. "us-west1-a". Mutually exclusive with worker_region. If neither worker_region nor worker_zone is specified, a zone in the control plane's region is chosen based on available capacity. If both `worker_zone` and `zone` are set, `worker_zone` takes precedence.
     * 
     */
    @Import(name="workerZone")
      private final @Nullable Output<String> workerZone;

    public Output<String> workerZone() {
        return this.workerZone == null ? Codegen.empty() : this.workerZone;
    }

    /**
     * The Compute Engine [availability zone](https://cloud.google.com/compute/docs/regions-zones/regions-zones) for launching worker instances to run your pipeline. In the future, worker_zone will take precedence.
     * 
     */
    @Import(name="zone")
      private final @Nullable Output<String> zone;

    public Output<String> zone() {
        return this.zone == null ? Codegen.empty() : this.zone;
    }

    public GoogleCloudDatapipelinesV1RuntimeEnvironmentArgs(
        @Nullable Output<List<String>> additionalExperiments,
        @Nullable Output<Map<String,String>> additionalUserLabels,
        @Nullable Output<Boolean> bypassTempDirValidation,
        @Nullable Output<Boolean> enableStreamingEngine,
        @Nullable Output<GoogleCloudDatapipelinesV1RuntimeEnvironmentIpConfiguration> ipConfiguration,
        @Nullable Output<String> kmsKeyName,
        @Nullable Output<String> machineType,
        @Nullable Output<Integer> maxWorkers,
        @Nullable Output<String> network,
        @Nullable Output<Integer> numWorkers,
        @Nullable Output<String> serviceAccountEmail,
        @Nullable Output<String> subnetwork,
        @Nullable Output<String> tempLocation,
        @Nullable Output<String> workerRegion,
        @Nullable Output<String> workerZone,
        @Nullable Output<String> zone) {
        this.additionalExperiments = additionalExperiments;
        this.additionalUserLabels = additionalUserLabels;
        this.bypassTempDirValidation = bypassTempDirValidation;
        this.enableStreamingEngine = enableStreamingEngine;
        this.ipConfiguration = ipConfiguration;
        this.kmsKeyName = kmsKeyName;
        this.machineType = machineType;
        this.maxWorkers = maxWorkers;
        this.network = network;
        this.numWorkers = numWorkers;
        this.serviceAccountEmail = serviceAccountEmail;
        this.subnetwork = subnetwork;
        this.tempLocation = tempLocation;
        this.workerRegion = workerRegion;
        this.workerZone = workerZone;
        this.zone = zone;
    }

    private GoogleCloudDatapipelinesV1RuntimeEnvironmentArgs() {
        this.additionalExperiments = Codegen.empty();
        this.additionalUserLabels = Codegen.empty();
        this.bypassTempDirValidation = Codegen.empty();
        this.enableStreamingEngine = Codegen.empty();
        this.ipConfiguration = Codegen.empty();
        this.kmsKeyName = Codegen.empty();
        this.machineType = Codegen.empty();
        this.maxWorkers = Codegen.empty();
        this.network = Codegen.empty();
        this.numWorkers = Codegen.empty();
        this.serviceAccountEmail = Codegen.empty();
        this.subnetwork = Codegen.empty();
        this.tempLocation = Codegen.empty();
        this.workerRegion = Codegen.empty();
        this.workerZone = Codegen.empty();
        this.zone = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDatapipelinesV1RuntimeEnvironmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> additionalExperiments;
        private @Nullable Output<Map<String,String>> additionalUserLabels;
        private @Nullable Output<Boolean> bypassTempDirValidation;
        private @Nullable Output<Boolean> enableStreamingEngine;
        private @Nullable Output<GoogleCloudDatapipelinesV1RuntimeEnvironmentIpConfiguration> ipConfiguration;
        private @Nullable Output<String> kmsKeyName;
        private @Nullable Output<String> machineType;
        private @Nullable Output<Integer> maxWorkers;
        private @Nullable Output<String> network;
        private @Nullable Output<Integer> numWorkers;
        private @Nullable Output<String> serviceAccountEmail;
        private @Nullable Output<String> subnetwork;
        private @Nullable Output<String> tempLocation;
        private @Nullable Output<String> workerRegion;
        private @Nullable Output<String> workerZone;
        private @Nullable Output<String> zone;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDatapipelinesV1RuntimeEnvironmentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalExperiments = defaults.additionalExperiments;
    	      this.additionalUserLabels = defaults.additionalUserLabels;
    	      this.bypassTempDirValidation = defaults.bypassTempDirValidation;
    	      this.enableStreamingEngine = defaults.enableStreamingEngine;
    	      this.ipConfiguration = defaults.ipConfiguration;
    	      this.kmsKeyName = defaults.kmsKeyName;
    	      this.machineType = defaults.machineType;
    	      this.maxWorkers = defaults.maxWorkers;
    	      this.network = defaults.network;
    	      this.numWorkers = defaults.numWorkers;
    	      this.serviceAccountEmail = defaults.serviceAccountEmail;
    	      this.subnetwork = defaults.subnetwork;
    	      this.tempLocation = defaults.tempLocation;
    	      this.workerRegion = defaults.workerRegion;
    	      this.workerZone = defaults.workerZone;
    	      this.zone = defaults.zone;
        }

        public Builder additionalExperiments(@Nullable Output<List<String>> additionalExperiments) {
            this.additionalExperiments = additionalExperiments;
            return this;
        }
        public Builder additionalExperiments(@Nullable List<String> additionalExperiments) {
            this.additionalExperiments = Codegen.ofNullable(additionalExperiments);
            return this;
        }
        public Builder additionalExperiments(String... additionalExperiments) {
            return additionalExperiments(List.of(additionalExperiments));
        }
        public Builder additionalUserLabels(@Nullable Output<Map<String,String>> additionalUserLabels) {
            this.additionalUserLabels = additionalUserLabels;
            return this;
        }
        public Builder additionalUserLabels(@Nullable Map<String,String> additionalUserLabels) {
            this.additionalUserLabels = Codegen.ofNullable(additionalUserLabels);
            return this;
        }
        public Builder bypassTempDirValidation(@Nullable Output<Boolean> bypassTempDirValidation) {
            this.bypassTempDirValidation = bypassTempDirValidation;
            return this;
        }
        public Builder bypassTempDirValidation(@Nullable Boolean bypassTempDirValidation) {
            this.bypassTempDirValidation = Codegen.ofNullable(bypassTempDirValidation);
            return this;
        }
        public Builder enableStreamingEngine(@Nullable Output<Boolean> enableStreamingEngine) {
            this.enableStreamingEngine = enableStreamingEngine;
            return this;
        }
        public Builder enableStreamingEngine(@Nullable Boolean enableStreamingEngine) {
            this.enableStreamingEngine = Codegen.ofNullable(enableStreamingEngine);
            return this;
        }
        public Builder ipConfiguration(@Nullable Output<GoogleCloudDatapipelinesV1RuntimeEnvironmentIpConfiguration> ipConfiguration) {
            this.ipConfiguration = ipConfiguration;
            return this;
        }
        public Builder ipConfiguration(@Nullable GoogleCloudDatapipelinesV1RuntimeEnvironmentIpConfiguration ipConfiguration) {
            this.ipConfiguration = Codegen.ofNullable(ipConfiguration);
            return this;
        }
        public Builder kmsKeyName(@Nullable Output<String> kmsKeyName) {
            this.kmsKeyName = kmsKeyName;
            return this;
        }
        public Builder kmsKeyName(@Nullable String kmsKeyName) {
            this.kmsKeyName = Codegen.ofNullable(kmsKeyName);
            return this;
        }
        public Builder machineType(@Nullable Output<String> machineType) {
            this.machineType = machineType;
            return this;
        }
        public Builder machineType(@Nullable String machineType) {
            this.machineType = Codegen.ofNullable(machineType);
            return this;
        }
        public Builder maxWorkers(@Nullable Output<Integer> maxWorkers) {
            this.maxWorkers = maxWorkers;
            return this;
        }
        public Builder maxWorkers(@Nullable Integer maxWorkers) {
            this.maxWorkers = Codegen.ofNullable(maxWorkers);
            return this;
        }
        public Builder network(@Nullable Output<String> network) {
            this.network = network;
            return this;
        }
        public Builder network(@Nullable String network) {
            this.network = Codegen.ofNullable(network);
            return this;
        }
        public Builder numWorkers(@Nullable Output<Integer> numWorkers) {
            this.numWorkers = numWorkers;
            return this;
        }
        public Builder numWorkers(@Nullable Integer numWorkers) {
            this.numWorkers = Codegen.ofNullable(numWorkers);
            return this;
        }
        public Builder serviceAccountEmail(@Nullable Output<String> serviceAccountEmail) {
            this.serviceAccountEmail = serviceAccountEmail;
            return this;
        }
        public Builder serviceAccountEmail(@Nullable String serviceAccountEmail) {
            this.serviceAccountEmail = Codegen.ofNullable(serviceAccountEmail);
            return this;
        }
        public Builder subnetwork(@Nullable Output<String> subnetwork) {
            this.subnetwork = subnetwork;
            return this;
        }
        public Builder subnetwork(@Nullable String subnetwork) {
            this.subnetwork = Codegen.ofNullable(subnetwork);
            return this;
        }
        public Builder tempLocation(@Nullable Output<String> tempLocation) {
            this.tempLocation = tempLocation;
            return this;
        }
        public Builder tempLocation(@Nullable String tempLocation) {
            this.tempLocation = Codegen.ofNullable(tempLocation);
            return this;
        }
        public Builder workerRegion(@Nullable Output<String> workerRegion) {
            this.workerRegion = workerRegion;
            return this;
        }
        public Builder workerRegion(@Nullable String workerRegion) {
            this.workerRegion = Codegen.ofNullable(workerRegion);
            return this;
        }
        public Builder workerZone(@Nullable Output<String> workerZone) {
            this.workerZone = workerZone;
            return this;
        }
        public Builder workerZone(@Nullable String workerZone) {
            this.workerZone = Codegen.ofNullable(workerZone);
            return this;
        }
        public Builder zone(@Nullable Output<String> zone) {
            this.zone = zone;
            return this;
        }
        public Builder zone(@Nullable String zone) {
            this.zone = Codegen.ofNullable(zone);
            return this;
        }        public GoogleCloudDatapipelinesV1RuntimeEnvironmentArgs build() {
            return new GoogleCloudDatapipelinesV1RuntimeEnvironmentArgs(additionalExperiments, additionalUserLabels, bypassTempDirValidation, enableStreamingEngine, ipConfiguration, kmsKeyName, machineType, maxWorkers, network, numWorkers, serviceAccountEmail, subnetwork, tempLocation, workerRegion, workerZone, zone);
        }
    }
}
