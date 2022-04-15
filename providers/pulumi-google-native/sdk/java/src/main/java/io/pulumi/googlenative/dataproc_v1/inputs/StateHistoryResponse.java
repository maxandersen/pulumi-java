// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataproc_v1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Historical state information.
 * 
 */
public final class StateHistoryResponse extends io.pulumi.resources.InvokeArgs {

    public static final StateHistoryResponse Empty = new StateHistoryResponse();

    /**
     * The state of the batch at this point in history.
     * 
     */
    @Import(name="state", required=true)
      private final String state;

    public String state() {
        return this.state;
    }

    /**
     * Details about the state at this point in history.
     * 
     */
    @Import(name="stateMessage", required=true)
      private final String stateMessage;

    public String stateMessage() {
        return this.stateMessage;
    }

    /**
     * The time when the batch entered the historical state.
     * 
     */
    @Import(name="stateStartTime", required=true)
      private final String stateStartTime;

    public String stateStartTime() {
        return this.stateStartTime;
    }

    public StateHistoryResponse(
        String state,
        String stateMessage,
        String stateStartTime) {
        this.state = Objects.requireNonNull(state, "expected parameter 'state' to be non-null");
        this.stateMessage = Objects.requireNonNull(stateMessage, "expected parameter 'stateMessage' to be non-null");
        this.stateStartTime = Objects.requireNonNull(stateStartTime, "expected parameter 'stateStartTime' to be non-null");
    }

    private StateHistoryResponse() {
        this.state = null;
        this.stateMessage = null;
        this.stateStartTime = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StateHistoryResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String state;
        private String stateMessage;
        private String stateStartTime;

        public Builder() {
    	      // Empty
        }

        public Builder(StateHistoryResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.state = defaults.state;
    	      this.stateMessage = defaults.stateMessage;
    	      this.stateStartTime = defaults.stateStartTime;
        }

        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public Builder stateMessage(String stateMessage) {
            this.stateMessage = Objects.requireNonNull(stateMessage);
            return this;
        }
        public Builder stateStartTime(String stateStartTime) {
            this.stateStartTime = Objects.requireNonNull(stateStartTime);
            return this;
        }        public StateHistoryResponse build() {
            return new StateHistoryResponse(state, stateMessage, stateStartTime);
        }
    }
}
