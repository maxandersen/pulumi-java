// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.composer_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class SoftwareConfigResponse {
    /**
     * Optional. Apache Airflow configuration properties to override. Property keys contain the section and property names, separated by a hyphen, for example &#34;core-dags_are_paused_at_creation&#34;. Section names must not contain hyphens (&#34;-&#34;), opening square brackets (&#34;[&#34;), or closing square brackets (&#34;]&#34;). The property name must not be empty and must not contain an equals sign (&#34;=&#34;) or semicolon (&#34;;&#34;). Section and property names must not contain a period (&#34;.&#34;). Apache Airflow configuration property names must be written in [snake_case](https://en.wikipedia.org/wiki/Snake_case). Property values can contain any character, and can be written in any lower/upper case format. Certain Apache Airflow configuration property values are [blocked](/composer/docs/concepts/airflow-configurations), and cannot be overridden.
     * 
     */
    private final Map<String,String> airflowConfigOverrides;
    /**
     * Optional. Additional environment variables to provide to the Apache Airflow scheduler, worker, and webserver processes. Environment variable names must match the regular expression `a-zA-Z_*`. They cannot specify Apache Airflow software configuration overrides (they cannot match the regular expression `AIRFLOW__[A-Z0-9_]+__[A-Z0-9_]+`), and they cannot match any of the following reserved names: * `AIRFLOW_HOME` * `C_FORCE_ROOT` * `CONTAINER_NAME` * `DAGS_FOLDER` * `GCP_PROJECT` * `GCS_BUCKET` * `GKE_CLUSTER_NAME` * `SQL_DATABASE` * `SQL_INSTANCE` * `SQL_PASSWORD` * `SQL_PROJECT` * `SQL_REGION` * `SQL_USER`
     * 
     */
    private final Map<String,String> envVariables;
    /**
     * The version of the software running in the environment. This encapsulates both the version of Cloud Composer functionality and the version of Apache Airflow. It must match the regular expression `composer-([0-9]+\.[0-9]+\.[0-9]+|latest)-airflow-[0-9]+\.[0-9]+(\.[0-9]+.*)?`. When used as input, the server also checks if the provided version is supported and denies the request for an unsupported version. The Cloud Composer portion of the version is a [semantic version](https://semver.org) or `latest`. When the patch version is omitted, the current Cloud Composer patch version is selected. When `latest` is provided instead of an explicit version number, the server replaces `latest` with the current Cloud Composer version and stores that version number in the same field. The portion of the image version that follows *airflow-* is an official Apache Airflow repository [release name](https://github.com/apache/incubator-airflow/releases). See also [Version List](/composer/docs/concepts/versioning/composer-versions).
     * 
     */
    private final String imageVersion;
    /**
     * Optional. Custom Python Package Index (PyPI) packages to be installed in the environment. Keys refer to the lowercase package name such as &#34;numpy&#34; and values are the lowercase extras and version specifier such as &#34;==1.12.0&#34;, &#34;[devel,gcp_api]&#34;, or &#34;[devel]&gt;=1.8.2, &lt;1.9.2&#34;. To specify a package without pinning it to a version specifier, use the empty string as the value.
     * 
     */
    private final Map<String,String> pypiPackages;
    /**
     * Optional. The major version of Python used to run the Apache Airflow scheduler, worker, and webserver processes. Can be set to &#39;2&#39; or &#39;3&#39;. If not specified, the default is &#39;3&#39;. Cannot be updated. This field is only supported for Cloud Composer environments in versions composer-1.*.*-airflow-*.*.*. Environments in newer versions always use Python major version 3.
     * 
     */
    private final String pythonVersion;
    /**
     * Optional. The number of schedulers for Airflow. This field is supported for Cloud Composer environments in versions composer-1.*.*-airflow-2.*.*.
     * 
     */
    private final Integer schedulerCount;

    @CustomType.Constructor
    private SoftwareConfigResponse(
        @CustomType.Parameter("airflowConfigOverrides") Map<String,String> airflowConfigOverrides,
        @CustomType.Parameter("envVariables") Map<String,String> envVariables,
        @CustomType.Parameter("imageVersion") String imageVersion,
        @CustomType.Parameter("pypiPackages") Map<String,String> pypiPackages,
        @CustomType.Parameter("pythonVersion") String pythonVersion,
        @CustomType.Parameter("schedulerCount") Integer schedulerCount) {
        this.airflowConfigOverrides = airflowConfigOverrides;
        this.envVariables = envVariables;
        this.imageVersion = imageVersion;
        this.pypiPackages = pypiPackages;
        this.pythonVersion = pythonVersion;
        this.schedulerCount = schedulerCount;
    }

    /**
     * Optional. Apache Airflow configuration properties to override. Property keys contain the section and property names, separated by a hyphen, for example &#34;core-dags_are_paused_at_creation&#34;. Section names must not contain hyphens (&#34;-&#34;), opening square brackets (&#34;[&#34;), or closing square brackets (&#34;]&#34;). The property name must not be empty and must not contain an equals sign (&#34;=&#34;) or semicolon (&#34;;&#34;). Section and property names must not contain a period (&#34;.&#34;). Apache Airflow configuration property names must be written in [snake_case](https://en.wikipedia.org/wiki/Snake_case). Property values can contain any character, and can be written in any lower/upper case format. Certain Apache Airflow configuration property values are [blocked](/composer/docs/concepts/airflow-configurations), and cannot be overridden.
     * 
    */
    public Map<String,String> airflowConfigOverrides() {
        return this.airflowConfigOverrides;
    }
    /**
     * Optional. Additional environment variables to provide to the Apache Airflow scheduler, worker, and webserver processes. Environment variable names must match the regular expression `a-zA-Z_*`. They cannot specify Apache Airflow software configuration overrides (they cannot match the regular expression `AIRFLOW__[A-Z0-9_]+__[A-Z0-9_]+`), and they cannot match any of the following reserved names: * `AIRFLOW_HOME` * `C_FORCE_ROOT` * `CONTAINER_NAME` * `DAGS_FOLDER` * `GCP_PROJECT` * `GCS_BUCKET` * `GKE_CLUSTER_NAME` * `SQL_DATABASE` * `SQL_INSTANCE` * `SQL_PASSWORD` * `SQL_PROJECT` * `SQL_REGION` * `SQL_USER`
     * 
    */
    public Map<String,String> envVariables() {
        return this.envVariables;
    }
    /**
     * The version of the software running in the environment. This encapsulates both the version of Cloud Composer functionality and the version of Apache Airflow. It must match the regular expression `composer-([0-9]+\.[0-9]+\.[0-9]+|latest)-airflow-[0-9]+\.[0-9]+(\.[0-9]+.*)?`. When used as input, the server also checks if the provided version is supported and denies the request for an unsupported version. The Cloud Composer portion of the version is a [semantic version](https://semver.org) or `latest`. When the patch version is omitted, the current Cloud Composer patch version is selected. When `latest` is provided instead of an explicit version number, the server replaces `latest` with the current Cloud Composer version and stores that version number in the same field. The portion of the image version that follows *airflow-* is an official Apache Airflow repository [release name](https://github.com/apache/incubator-airflow/releases). See also [Version List](/composer/docs/concepts/versioning/composer-versions).
     * 
    */
    public String imageVersion() {
        return this.imageVersion;
    }
    /**
     * Optional. Custom Python Package Index (PyPI) packages to be installed in the environment. Keys refer to the lowercase package name such as &#34;numpy&#34; and values are the lowercase extras and version specifier such as &#34;==1.12.0&#34;, &#34;[devel,gcp_api]&#34;, or &#34;[devel]&gt;=1.8.2, &lt;1.9.2&#34;. To specify a package without pinning it to a version specifier, use the empty string as the value.
     * 
    */
    public Map<String,String> pypiPackages() {
        return this.pypiPackages;
    }
    /**
     * Optional. The major version of Python used to run the Apache Airflow scheduler, worker, and webserver processes. Can be set to &#39;2&#39; or &#39;3&#39;. If not specified, the default is &#39;3&#39;. Cannot be updated. This field is only supported for Cloud Composer environments in versions composer-1.*.*-airflow-*.*.*. Environments in newer versions always use Python major version 3.
     * 
    */
    public String pythonVersion() {
        return this.pythonVersion;
    }
    /**
     * Optional. The number of schedulers for Airflow. This field is supported for Cloud Composer environments in versions composer-1.*.*-airflow-2.*.*.
     * 
    */
    public Integer schedulerCount() {
        return this.schedulerCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SoftwareConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Map<String,String> airflowConfigOverrides;
        private Map<String,String> envVariables;
        private String imageVersion;
        private Map<String,String> pypiPackages;
        private String pythonVersion;
        private Integer schedulerCount;

        public Builder() {
    	      // Empty
        }

        public Builder(SoftwareConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.airflowConfigOverrides = defaults.airflowConfigOverrides;
    	      this.envVariables = defaults.envVariables;
    	      this.imageVersion = defaults.imageVersion;
    	      this.pypiPackages = defaults.pypiPackages;
    	      this.pythonVersion = defaults.pythonVersion;
    	      this.schedulerCount = defaults.schedulerCount;
        }

        public Builder airflowConfigOverrides(Map<String,String> airflowConfigOverrides) {
            this.airflowConfigOverrides = Objects.requireNonNull(airflowConfigOverrides);
            return this;
        }
        public Builder envVariables(Map<String,String> envVariables) {
            this.envVariables = Objects.requireNonNull(envVariables);
            return this;
        }
        public Builder imageVersion(String imageVersion) {
            this.imageVersion = Objects.requireNonNull(imageVersion);
            return this;
        }
        public Builder pypiPackages(Map<String,String> pypiPackages) {
            this.pypiPackages = Objects.requireNonNull(pypiPackages);
            return this;
        }
        public Builder pythonVersion(String pythonVersion) {
            this.pythonVersion = Objects.requireNonNull(pythonVersion);
            return this;
        }
        public Builder schedulerCount(Integer schedulerCount) {
            this.schedulerCount = Objects.requireNonNull(schedulerCount);
            return this;
        }        public SoftwareConfigResponse build() {
            return new SoftwareConfigResponse(airflowConfigOverrides, envVariables, imageVersion, pypiPackages, pythonVersion, schedulerCount);
        }
    }
}
