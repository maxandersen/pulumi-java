// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataproc_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;


/**
 * Specifies the selection and config of software inside the cluster.
 * 
 */
public final class SoftwareConfigResponse extends com.pulumi.resources.InvokeArgs {

    public static final SoftwareConfigResponse Empty = new SoftwareConfigResponse();

    /**
     * Optional. The version of software inside the cluster. It must be one of the supported Dataproc Versions (https://cloud.google.com/dataproc/docs/concepts/versioning/dataproc-versions#supported_dataproc_versions), such as &#34;1.2&#34; (including a subminor version, such as &#34;1.2.29&#34;), or the &#34;preview&#34; version (https://cloud.google.com/dataproc/docs/concepts/versioning/dataproc-versions#other_versions). If unspecified, it defaults to the latest Debian version.
     * 
     */
    @Import(name="imageVersion", required=true)
    private String imageVersion;

    public String imageVersion() {
        return this.imageVersion;
    }

    /**
     * Optional. The set of components to activate on the cluster.
     * 
     */
    @Import(name="optionalComponents", required=true)
    private List<String> optionalComponents;

    public List<String> optionalComponents() {
        return this.optionalComponents;
    }

    /**
     * Optional. The properties to set on daemon config files.Property keys are specified in prefix:property format, for example core:hadoop.tmp.dir. The following are supported prefixes and their mappings: capacity-scheduler: capacity-scheduler.xml core: core-site.xml distcp: distcp-default.xml hdfs: hdfs-site.xml hive: hive-site.xml mapred: mapred-site.xml pig: pig.properties spark: spark-defaults.conf yarn: yarn-site.xmlFor more information, see Cluster properties (https://cloud.google.com/dataproc/docs/concepts/cluster-properties).
     * 
     */
    @Import(name="properties", required=true)
    private Map<String,String> properties;

    public Map<String,String> properties() {
        return this.properties;
    }

    private SoftwareConfigResponse() {}

    private SoftwareConfigResponse(SoftwareConfigResponse $) {
        this.imageVersion = $.imageVersion;
        this.optionalComponents = $.optionalComponents;
        this.properties = $.properties;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SoftwareConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SoftwareConfigResponse $;

        public Builder() {
            $ = new SoftwareConfigResponse();
        }

        public Builder(SoftwareConfigResponse defaults) {
            $ = new SoftwareConfigResponse(Objects.requireNonNull(defaults));
        }

        public Builder imageVersion(String imageVersion) {
            $.imageVersion = imageVersion;
            return this;
        }

        public Builder optionalComponents(List<String> optionalComponents) {
            $.optionalComponents = optionalComponents;
            return this;
        }

        public Builder optionalComponents(String... optionalComponents) {
            return optionalComponents(List.of(optionalComponents));
        }

        public Builder properties(Map<String,String> properties) {
            $.properties = properties;
            return this;
        }

        public SoftwareConfigResponse build() {
            $.imageVersion = Objects.requireNonNull($.imageVersion, "expected parameter 'imageVersion' to be non-null");
            $.optionalComponents = Objects.requireNonNull($.optionalComponents, "expected parameter 'optionalComponents' to be non-null");
            $.properties = Objects.requireNonNull($.properties, "expected parameter 'properties' to be non-null");
            return $;
        }
    }

}
