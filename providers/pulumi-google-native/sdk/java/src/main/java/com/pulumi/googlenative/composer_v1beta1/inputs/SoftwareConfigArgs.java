// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.composer_v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Specifies the selection and configuration of software inside the environment.
 * 
 */
public final class SoftwareConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final SoftwareConfigArgs Empty = new SoftwareConfigArgs();

    /**
     * Optional. Apache Airflow configuration properties to override. Property keys contain the section and property names, separated by a hyphen, for example "core-dags_are_paused_at_creation". Section names must not contain hyphens ("-"), opening square brackets ("["), or closing square brackets ("]"). The property name must not be empty and must not contain an equals sign ("=") or semicolon (";"). Section and property names must not contain a period ("."). Apache Airflow configuration property names must be written in [snake_case](https://en.wikipedia.org/wiki/Snake_case). Property values can contain any character, and can be written in any lower/upper case format. Certain Apache Airflow configuration property values are [blocked](/composer/docs/concepts/airflow-configurations), and cannot be overridden.
     * 
     */
    @Import(name="airflowConfigOverrides")
      private final @Nullable Output<Map<String,String>> airflowConfigOverrides;

    public Output<Map<String,String>> airflowConfigOverrides() {
        return this.airflowConfigOverrides == null ? Codegen.empty() : this.airflowConfigOverrides;
    }

    /**
     * Optional. Additional environment variables to provide to the Apache Airflow scheduler, worker, and webserver processes. Environment variable names must match the regular expression `a-zA-Z_*`. They cannot specify Apache Airflow software configuration overrides (they cannot match the regular expression `AIRFLOW__[A-Z0-9_]+__[A-Z0-9_]+`), and they cannot match any of the following reserved names: * `AIRFLOW_HOME` * `C_FORCE_ROOT` * `CONTAINER_NAME` * `DAGS_FOLDER` * `GCP_PROJECT` * `GCS_BUCKET` * `GKE_CLUSTER_NAME` * `SQL_DATABASE` * `SQL_INSTANCE` * `SQL_PASSWORD` * `SQL_PROJECT` * `SQL_REGION` * `SQL_USER`
     * 
     */
    @Import(name="envVariables")
      private final @Nullable Output<Map<String,String>> envVariables;

    public Output<Map<String,String>> envVariables() {
        return this.envVariables == null ? Codegen.empty() : this.envVariables;
    }

    /**
     * The version of the software running in the environment. This encapsulates both the version of Cloud Composer functionality and the version of Apache Airflow. It must match the regular expression `composer-([0-9]+\.[0-9]+\.[0-9]+|latest)-airflow-[0-9]+\.[0-9]+(\.[0-9]+.*)?`. When used as input, the server also checks if the provided version is supported and denies the request for an unsupported version. The Cloud Composer portion of the version is a [semantic version](https://semver.org) or `latest`. When the patch version is omitted, the current Cloud Composer patch version is selected. When `latest` is provided instead of an explicit version number, the server replaces `latest` with the current Cloud Composer version and stores that version number in the same field. The portion of the image version that follows *airflow-* is an official Apache Airflow repository [release name](https://github.com/apache/incubator-airflow/releases). See also [Version List](/composer/docs/concepts/versioning/composer-versions).
     * 
     */
    @Import(name="imageVersion")
      private final @Nullable Output<String> imageVersion;

    public Output<String> imageVersion() {
        return this.imageVersion == null ? Codegen.empty() : this.imageVersion;
    }

    /**
     * Optional. Custom Python Package Index (PyPI) packages to be installed in the environment. Keys refer to the lowercase package name such as "numpy" and values are the lowercase extras and version specifier such as "==1.12.0", "[devel,gcp_api]", or "[devel]>=1.8.2, <1.9.2". To specify a package without pinning it to a version specifier, use the empty string as the value.
     * 
     */
    @Import(name="pypiPackages")
      private final @Nullable Output<Map<String,String>> pypiPackages;

    public Output<Map<String,String>> pypiPackages() {
        return this.pypiPackages == null ? Codegen.empty() : this.pypiPackages;
    }

    /**
     * Optional. The major version of Python used to run the Apache Airflow scheduler, worker, and webserver processes. Can be set to '2' or '3'. If not specified, the default is '3'. Cannot be updated. This field is only supported for Cloud Composer environments in versions composer-1.*.*-airflow-*.*.*. Environments in newer versions always use Python major version 3.
     * 
     */
    @Import(name="pythonVersion")
      private final @Nullable Output<String> pythonVersion;

    public Output<String> pythonVersion() {
        return this.pythonVersion == null ? Codegen.empty() : this.pythonVersion;
    }

    /**
     * Optional. The number of schedulers for Airflow. This field is supported for Cloud Composer environments in versions composer-1.*.*-airflow-2.*.*.
     * 
     */
    @Import(name="schedulerCount")
      private final @Nullable Output<Integer> schedulerCount;

    public Output<Integer> schedulerCount() {
        return this.schedulerCount == null ? Codegen.empty() : this.schedulerCount;
    }

    public SoftwareConfigArgs(
        @Nullable Output<Map<String,String>> airflowConfigOverrides,
        @Nullable Output<Map<String,String>> envVariables,
        @Nullable Output<String> imageVersion,
        @Nullable Output<Map<String,String>> pypiPackages,
        @Nullable Output<String> pythonVersion,
        @Nullable Output<Integer> schedulerCount) {
        this.airflowConfigOverrides = airflowConfigOverrides;
        this.envVariables = envVariables;
        this.imageVersion = imageVersion;
        this.pypiPackages = pypiPackages;
        this.pythonVersion = pythonVersion;
        this.schedulerCount = schedulerCount;
    }

    private SoftwareConfigArgs() {
        this.airflowConfigOverrides = Codegen.empty();
        this.envVariables = Codegen.empty();
        this.imageVersion = Codegen.empty();
        this.pypiPackages = Codegen.empty();
        this.pythonVersion = Codegen.empty();
        this.schedulerCount = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SoftwareConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Map<String,String>> airflowConfigOverrides;
        private @Nullable Output<Map<String,String>> envVariables;
        private @Nullable Output<String> imageVersion;
        private @Nullable Output<Map<String,String>> pypiPackages;
        private @Nullable Output<String> pythonVersion;
        private @Nullable Output<Integer> schedulerCount;

        public Builder() {
    	      // Empty
        }

        public Builder(SoftwareConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.airflowConfigOverrides = defaults.airflowConfigOverrides;
    	      this.envVariables = defaults.envVariables;
    	      this.imageVersion = defaults.imageVersion;
    	      this.pypiPackages = defaults.pypiPackages;
    	      this.pythonVersion = defaults.pythonVersion;
    	      this.schedulerCount = defaults.schedulerCount;
        }

        public Builder airflowConfigOverrides(@Nullable Output<Map<String,String>> airflowConfigOverrides) {
            this.airflowConfigOverrides = airflowConfigOverrides;
            return this;
        }
        public Builder airflowConfigOverrides(@Nullable Map<String,String> airflowConfigOverrides) {
            this.airflowConfigOverrides = Codegen.ofNullable(airflowConfigOverrides);
            return this;
        }
        public Builder envVariables(@Nullable Output<Map<String,String>> envVariables) {
            this.envVariables = envVariables;
            return this;
        }
        public Builder envVariables(@Nullable Map<String,String> envVariables) {
            this.envVariables = Codegen.ofNullable(envVariables);
            return this;
        }
        public Builder imageVersion(@Nullable Output<String> imageVersion) {
            this.imageVersion = imageVersion;
            return this;
        }
        public Builder imageVersion(@Nullable String imageVersion) {
            this.imageVersion = Codegen.ofNullable(imageVersion);
            return this;
        }
        public Builder pypiPackages(@Nullable Output<Map<String,String>> pypiPackages) {
            this.pypiPackages = pypiPackages;
            return this;
        }
        public Builder pypiPackages(@Nullable Map<String,String> pypiPackages) {
            this.pypiPackages = Codegen.ofNullable(pypiPackages);
            return this;
        }
        public Builder pythonVersion(@Nullable Output<String> pythonVersion) {
            this.pythonVersion = pythonVersion;
            return this;
        }
        public Builder pythonVersion(@Nullable String pythonVersion) {
            this.pythonVersion = Codegen.ofNullable(pythonVersion);
            return this;
        }
        public Builder schedulerCount(@Nullable Output<Integer> schedulerCount) {
            this.schedulerCount = schedulerCount;
            return this;
        }
        public Builder schedulerCount(@Nullable Integer schedulerCount) {
            this.schedulerCount = Codegen.ofNullable(schedulerCount);
            return this;
        }        public SoftwareConfigArgs build() {
            return new SoftwareConfigArgs(airflowConfigOverrides, envVariables, imageVersion, pypiPackages, pythonVersion, schedulerCount);
        }
    }
}
