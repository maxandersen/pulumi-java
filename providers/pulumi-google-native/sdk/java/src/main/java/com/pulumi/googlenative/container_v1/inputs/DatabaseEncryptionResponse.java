// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.container_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Configuration of etcd encryption.
 * 
 */
public final class DatabaseEncryptionResponse extends com.pulumi.resources.InvokeArgs {

    public static final DatabaseEncryptionResponse Empty = new DatabaseEncryptionResponse();

    /**
     * Name of CloudKMS key to use for the encryption of secrets in etcd. Ex. projects/my-project/locations/global/keyRings/my-ring/cryptoKeys/my-key
     * 
     */
    @Import(name="keyName", required=true)
    private String keyName;

    public String keyName() {
        return this.keyName;
    }

    /**
     * Denotes the state of etcd encryption.
     * 
     */
    @Import(name="state", required=true)
    private String state;

    public String state() {
        return this.state;
    }

    private DatabaseEncryptionResponse() {}

    private DatabaseEncryptionResponse(DatabaseEncryptionResponse $) {
        this.keyName = $.keyName;
        this.state = $.state;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DatabaseEncryptionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DatabaseEncryptionResponse $;

        public Builder() {
            $ = new DatabaseEncryptionResponse();
        }

        public Builder(DatabaseEncryptionResponse defaults) {
            $ = new DatabaseEncryptionResponse(Objects.requireNonNull(defaults));
        }

        public Builder keyName(String keyName) {
            $.keyName = keyName;
            return this;
        }

        public Builder state(String state) {
            $.state = state;
            return this;
        }

        public DatabaseEncryptionResponse build() {
            $.keyName = Objects.requireNonNull($.keyName, "expected parameter 'keyName' to be non-null");
            $.state = Objects.requireNonNull($.state, "expected parameter 'state' to be non-null");
            return $;
        }
    }

}
