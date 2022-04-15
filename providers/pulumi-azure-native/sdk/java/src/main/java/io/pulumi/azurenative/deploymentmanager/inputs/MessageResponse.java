// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.deploymentmanager.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Supplementary contextual messages during a rollout.
 * 
 */
public final class MessageResponse extends io.pulumi.resources.InvokeArgs {

    public static final MessageResponse Empty = new MessageResponse();

    /**
     * The actual message text.
     * 
     */
    @Import(name="message", required=true)
      private final String message;

    public String message() {
        return this.message;
    }

    /**
     * Time in UTC this message was provided.
     * 
     */
    @Import(name="timeStamp", required=true)
      private final String timeStamp;

    public String timeStamp() {
        return this.timeStamp;
    }

    public MessageResponse(
        String message,
        String timeStamp) {
        this.message = Objects.requireNonNull(message, "expected parameter 'message' to be non-null");
        this.timeStamp = Objects.requireNonNull(timeStamp, "expected parameter 'timeStamp' to be non-null");
    }

    private MessageResponse() {
        this.message = null;
        this.timeStamp = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MessageResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String message;
        private String timeStamp;

        public Builder() {
    	      // Empty
        }

        public Builder(MessageResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.message = defaults.message;
    	      this.timeStamp = defaults.timeStamp;
        }

        public Builder message(String message) {
            this.message = Objects.requireNonNull(message);
            return this;
        }
        public Builder timeStamp(String timeStamp) {
            this.timeStamp = Objects.requireNonNull(timeStamp);
            return this;
        }        public MessageResponse build() {
            return new MessageResponse(message, timeStamp);
        }
    }
}
