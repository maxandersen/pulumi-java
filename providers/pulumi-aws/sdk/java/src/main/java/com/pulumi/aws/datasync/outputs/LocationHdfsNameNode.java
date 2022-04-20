// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.datasync.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class LocationHdfsNameNode {
    /**
     * The hostname of the NameNode in the HDFS cluster. This value is the IP address or Domain Name Service (DNS) name of the NameNode. An agent that&#39;s installed on-premises uses this hostname to communicate with the NameNode in the network.
     * 
     */
    private final String hostname;
    /**
     * The port that the NameNode uses to listen to client requests.
     * 
     */
    private final Integer port;

    @CustomType.Constructor
    private LocationHdfsNameNode(
        @CustomType.Parameter("hostname") String hostname,
        @CustomType.Parameter("port") Integer port) {
        this.hostname = hostname;
        this.port = port;
    }

    /**
     * The hostname of the NameNode in the HDFS cluster. This value is the IP address or Domain Name Service (DNS) name of the NameNode. An agent that&#39;s installed on-premises uses this hostname to communicate with the NameNode in the network.
     * 
    */
    public String hostname() {
        return this.hostname;
    }
    /**
     * The port that the NameNode uses to listen to client requests.
     * 
    */
    public Integer port() {
        return this.port;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LocationHdfsNameNode defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String hostname;
        private Integer port;

        public Builder() {
    	      // Empty
        }

        public Builder(LocationHdfsNameNode defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hostname = defaults.hostname;
    	      this.port = defaults.port;
        }

        public Builder hostname(String hostname) {
            this.hostname = Objects.requireNonNull(hostname);
            return this;
        }
        public Builder port(Integer port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }        public LocationHdfsNameNode build() {
            return new LocationHdfsNameNode(hostname, port);
        }
    }
}
