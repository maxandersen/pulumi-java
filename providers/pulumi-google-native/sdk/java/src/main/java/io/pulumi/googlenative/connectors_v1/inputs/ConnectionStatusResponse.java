// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.connectors_v1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * ConnectionStatus indicates the state of the connection.
 * 
 */
public final class ConnectionStatusResponse extends io.pulumi.resources.InvokeArgs {

    public static final ConnectionStatusResponse Empty = new ConnectionStatusResponse();

    /**
     * Description.
     * 
     */
    @Import(name="description", required=true)
      private final String description;

    public String description() {
        return this.description;
    }

    /**
     * State.
     * 
     */
    @Import(name="state", required=true)
      private final String state;

    public String state() {
        return this.state;
    }

    /**
     * Status provides detailed information for the state.
     * 
     */
    @Import(name="status", required=true)
      private final String status;

    public String status() {
        return this.status;
    }

    public ConnectionStatusResponse(
        String description,
        String state,
        String status) {
        this.description = Objects.requireNonNull(description, "expected parameter 'description' to be non-null");
        this.state = Objects.requireNonNull(state, "expected parameter 'state' to be non-null");
        this.status = Objects.requireNonNull(status, "expected parameter 'status' to be non-null");
    }

    private ConnectionStatusResponse() {
        this.description = null;
        this.state = null;
        this.status = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionStatusResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String description;
        private String state;
        private String status;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectionStatusResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.state = defaults.state;
    	      this.status = defaults.status;
        }

        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }        public ConnectionStatusResponse build() {
            return new ConnectionStatusResponse(description, state, status);
        }
    }
}
