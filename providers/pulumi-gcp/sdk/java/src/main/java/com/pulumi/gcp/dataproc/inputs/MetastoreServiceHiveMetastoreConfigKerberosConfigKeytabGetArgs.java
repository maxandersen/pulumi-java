// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataproc.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class MetastoreServiceHiveMetastoreConfigKerberosConfigKeytabGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final MetastoreServiceHiveMetastoreConfigKerberosConfigKeytabGetArgs Empty = new MetastoreServiceHiveMetastoreConfigKerberosConfigKeytabGetArgs();

    /**
     * The relative resource name of a Secret Manager secret version, in the following form:
     * &#34;projects/{projectNumber}/secrets/{secret_id}/versions/{version_id}&#34;.
     * 
     */
    @Import(name="cloudSecret", required=true)
    private Output<String> cloudSecret;

    public Output<String> cloudSecret() {
        return this.cloudSecret;
    }

    private MetastoreServiceHiveMetastoreConfigKerberosConfigKeytabGetArgs() {}

    private MetastoreServiceHiveMetastoreConfigKerberosConfigKeytabGetArgs(MetastoreServiceHiveMetastoreConfigKerberosConfigKeytabGetArgs $) {
        this.cloudSecret = $.cloudSecret;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MetastoreServiceHiveMetastoreConfigKerberosConfigKeytabGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MetastoreServiceHiveMetastoreConfigKerberosConfigKeytabGetArgs $;

        public Builder() {
            $ = new MetastoreServiceHiveMetastoreConfigKerberosConfigKeytabGetArgs();
        }

        public Builder(MetastoreServiceHiveMetastoreConfigKerberosConfigKeytabGetArgs defaults) {
            $ = new MetastoreServiceHiveMetastoreConfigKerberosConfigKeytabGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder cloudSecret(Output<String> cloudSecret) {
            $.cloudSecret = cloudSecret;
            return this;
        }

        public Builder cloudSecret(String cloudSecret) {
            return cloudSecret(Output.of(cloudSecret));
        }

        public MetastoreServiceHiveMetastoreConfigKerberosConfigKeytabGetArgs build() {
            $.cloudSecret = Objects.requireNonNull($.cloudSecret, "expected parameter 'cloudSecret' to be non-null");
            return $;
        }
    }

}
