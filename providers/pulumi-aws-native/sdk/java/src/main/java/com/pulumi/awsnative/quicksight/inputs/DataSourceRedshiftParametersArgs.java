// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.quicksight.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * &lt;p&gt;Amazon Redshift parameters. The &lt;code&gt;ClusterId&lt;/code&gt; field can be blank if
 *             &lt;code&gt;Host&lt;/code&gt; and &lt;code&gt;Port&lt;/code&gt; are both set. The &lt;code&gt;Host&lt;/code&gt; and
 *             &lt;code&gt;Port&lt;/code&gt; fields can be blank if the &lt;code&gt;ClusterId&lt;/code&gt; field is set.&lt;/p&gt;
 * 
 */
public final class DataSourceRedshiftParametersArgs extends com.pulumi.resources.ResourceArgs {

    public static final DataSourceRedshiftParametersArgs Empty = new DataSourceRedshiftParametersArgs();

    /**
     * &lt;p&gt;Cluster ID. This field can be blank if the &lt;code&gt;Host&lt;/code&gt; and &lt;code&gt;Port&lt;/code&gt; are
     *             provided.&lt;/p&gt;
     * 
     */
    @Import(name="clusterId")
    private @Nullable Output<String> clusterId;

    /**
     * @return &lt;p&gt;Cluster ID. This field can be blank if the &lt;code&gt;Host&lt;/code&gt; and &lt;code&gt;Port&lt;/code&gt; are
     *             provided.&lt;/p&gt;
     * 
     */
    public Optional<Output<String>> clusterId() {
        return Optional.ofNullable(this.clusterId);
    }

    /**
     * &lt;p&gt;Database.&lt;/p&gt;
     * 
     */
    @Import(name="database", required=true)
    private Output<String> database;

    /**
     * @return &lt;p&gt;Database.&lt;/p&gt;
     * 
     */
    public Output<String> database() {
        return this.database;
    }

    /**
     * &lt;p&gt;Host. This field can be blank if &lt;code&gt;ClusterId&lt;/code&gt; is provided.&lt;/p&gt;
     * 
     */
    @Import(name="host")
    private @Nullable Output<String> host;

    /**
     * @return &lt;p&gt;Host. This field can be blank if &lt;code&gt;ClusterId&lt;/code&gt; is provided.&lt;/p&gt;
     * 
     */
    public Optional<Output<String>> host() {
        return Optional.ofNullable(this.host);
    }

    /**
     * &lt;p&gt;Port. This field can be blank if the &lt;code&gt;ClusterId&lt;/code&gt; is provided.&lt;/p&gt;
     * 
     */
    @Import(name="port")
    private @Nullable Output<Double> port;

    /**
     * @return &lt;p&gt;Port. This field can be blank if the &lt;code&gt;ClusterId&lt;/code&gt; is provided.&lt;/p&gt;
     * 
     */
    public Optional<Output<Double>> port() {
        return Optional.ofNullable(this.port);
    }

    private DataSourceRedshiftParametersArgs() {}

    private DataSourceRedshiftParametersArgs(DataSourceRedshiftParametersArgs $) {
        this.clusterId = $.clusterId;
        this.database = $.database;
        this.host = $.host;
        this.port = $.port;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DataSourceRedshiftParametersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DataSourceRedshiftParametersArgs $;

        public Builder() {
            $ = new DataSourceRedshiftParametersArgs();
        }

        public Builder(DataSourceRedshiftParametersArgs defaults) {
            $ = new DataSourceRedshiftParametersArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param clusterId &lt;p&gt;Cluster ID. This field can be blank if the &lt;code&gt;Host&lt;/code&gt; and &lt;code&gt;Port&lt;/code&gt; are
         *             provided.&lt;/p&gt;
         * 
         * @return builder
         * 
         */
        public Builder clusterId(@Nullable Output<String> clusterId) {
            $.clusterId = clusterId;
            return this;
        }

        /**
         * @param clusterId &lt;p&gt;Cluster ID. This field can be blank if the &lt;code&gt;Host&lt;/code&gt; and &lt;code&gt;Port&lt;/code&gt; are
         *             provided.&lt;/p&gt;
         * 
         * @return builder
         * 
         */
        public Builder clusterId(String clusterId) {
            return clusterId(Output.of(clusterId));
        }

        /**
         * @param database &lt;p&gt;Database.&lt;/p&gt;
         * 
         * @return builder
         * 
         */
        public Builder database(Output<String> database) {
            $.database = database;
            return this;
        }

        /**
         * @param database &lt;p&gt;Database.&lt;/p&gt;
         * 
         * @return builder
         * 
         */
        public Builder database(String database) {
            return database(Output.of(database));
        }

        /**
         * @param host &lt;p&gt;Host. This field can be blank if &lt;code&gt;ClusterId&lt;/code&gt; is provided.&lt;/p&gt;
         * 
         * @return builder
         * 
         */
        public Builder host(@Nullable Output<String> host) {
            $.host = host;
            return this;
        }

        /**
         * @param host &lt;p&gt;Host. This field can be blank if &lt;code&gt;ClusterId&lt;/code&gt; is provided.&lt;/p&gt;
         * 
         * @return builder
         * 
         */
        public Builder host(String host) {
            return host(Output.of(host));
        }

        /**
         * @param port &lt;p&gt;Port. This field can be blank if the &lt;code&gt;ClusterId&lt;/code&gt; is provided.&lt;/p&gt;
         * 
         * @return builder
         * 
         */
        public Builder port(@Nullable Output<Double> port) {
            $.port = port;
            return this;
        }

        /**
         * @param port &lt;p&gt;Port. This field can be blank if the &lt;code&gt;ClusterId&lt;/code&gt; is provided.&lt;/p&gt;
         * 
         * @return builder
         * 
         */
        public Builder port(Double port) {
            return port(Output.of(port));
        }

        public DataSourceRedshiftParametersArgs build() {
            $.database = Objects.requireNonNull($.database, "expected parameter 'database' to be non-null");
            return $;
        }
    }

}
