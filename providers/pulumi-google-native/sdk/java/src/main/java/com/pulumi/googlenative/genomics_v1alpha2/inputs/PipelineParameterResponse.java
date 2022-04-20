// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.genomics_v1alpha2.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.genomics_v1alpha2.inputs.LocalCopyResponse;
import java.lang.String;
import java.util.Objects;


/**
 * Parameters facilitate setting and delivering data into the pipeline&#39;s execution environment. They are defined at create time, with optional defaults, and can be overridden at run time. If `localCopy` is unset, then the parameter specifies a string that is passed as-is into the pipeline, as the value of the environment variable with the given name. A default value can be optionally specified at create time. The default can be overridden at run time using the inputs map. If no default is given, a value must be supplied at runtime. If `localCopy` is defined, then the parameter specifies a data source or sink, both in Google Cloud Storage and on the Docker container where the pipeline computation is run. The service account associated with the Pipeline (by default the project&#39;s Compute Engine service account) must have access to the Google Cloud Storage paths. At run time, the Google Cloud Storage paths can be overridden if a default was provided at create time, or must be set otherwise. The pipeline runner should add a key/value pair to either the inputs or outputs map. The indicated data copies will be carried out before/after pipeline execution, just as if the corresponding arguments were provided to `gsutil cp`. For example: Given the following `PipelineParameter`, specified in the `inputParameters` list: ```{name: &#34;input_file&#34;, localCopy: {path: &#34;file.txt&#34;, disk: &#34;pd1&#34;}}``` where `disk` is defined in the `PipelineResources` object as: ```{name: &#34;pd1&#34;, mountPoint: &#34;/mnt/disk/&#34;}``` We create a disk named `pd1`, mount it on the host VM, and map `/mnt/pd1` to `/mnt/disk` in the docker container. At runtime, an entry for `input_file` would be required in the inputs map, such as: ```inputs[&#34;input_file&#34;] = &#34;gs://my-bucket/bar.txt&#34;``` This would generate the following gsutil call: ```gsutil cp gs://my-bucket/bar.txt /mnt/pd1/file.txt``` The file `/mnt/pd1/file.txt` maps to `/mnt/disk/file.txt` in the Docker container. Acceptable paths are: Google Cloud storage pathLocal path file file glob directory For outputs, the direction of the copy is reversed: ```gsutil cp /mnt/disk/file.txt gs://my-bucket/bar.txt``` Acceptable paths are: Local pathGoogle Cloud Storage path file file file directory - directory must already exist glob directory - directory will be created if it doesn&#39;t exist One restriction due to docker limitations, is that for outputs that are found on the boot disk, the local path cannot be a glob and must be a file.
 * 
 */
public final class PipelineParameterResponse extends com.pulumi.resources.InvokeArgs {

    public static final PipelineParameterResponse Empty = new PipelineParameterResponse();

    /**
     * The default value for this parameter. Can be overridden at runtime. If `localCopy` is present, then this must be a Google Cloud Storage path beginning with `gs://`.
     * 
     */
    @Import(name="defaultValue", required=true)
      private final String defaultValue;

    public String defaultValue() {
        return this.defaultValue;
    }

    /**
     * Human-readable description.
     * 
     */
    @Import(name="description", required=true)
      private final String description;

    public String description() {
        return this.description;
    }

    /**
     * If present, this parameter is marked for copying to and from the VM. `LocalCopy` indicates where on the VM the file should be. The value given to this parameter (either at runtime or using `defaultValue`) must be the remote path where the file should be.
     * 
     */
    @Import(name="localCopy", required=true)
      private final LocalCopyResponse localCopy;

    public LocalCopyResponse localCopy() {
        return this.localCopy;
    }

    /**
     * Name of the parameter - the pipeline runner uses this string as the key to the input and output maps in RunPipeline.
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String name() {
        return this.name;
    }

    public PipelineParameterResponse(
        String defaultValue,
        String description,
        LocalCopyResponse localCopy,
        String name) {
        this.defaultValue = Objects.requireNonNull(defaultValue, "expected parameter 'defaultValue' to be non-null");
        this.description = Objects.requireNonNull(description, "expected parameter 'description' to be non-null");
        this.localCopy = Objects.requireNonNull(localCopy, "expected parameter 'localCopy' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private PipelineParameterResponse() {
        this.defaultValue = null;
        this.description = null;
        this.localCopy = null;
        this.name = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PipelineParameterResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String defaultValue;
        private String description;
        private LocalCopyResponse localCopy;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(PipelineParameterResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultValue = defaults.defaultValue;
    	      this.description = defaults.description;
    	      this.localCopy = defaults.localCopy;
    	      this.name = defaults.name;
        }

        public Builder defaultValue(String defaultValue) {
            this.defaultValue = Objects.requireNonNull(defaultValue);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder localCopy(LocalCopyResponse localCopy) {
            this.localCopy = Objects.requireNonNull(localCopy);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }        public PipelineParameterResponse build() {
            return new PipelineParameterResponse(defaultValue, description, localCopy, name);
        }
    }
}
