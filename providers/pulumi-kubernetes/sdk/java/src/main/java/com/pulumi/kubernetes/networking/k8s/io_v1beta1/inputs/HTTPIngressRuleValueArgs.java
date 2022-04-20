// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.networking.k8s.io_v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.kubernetes.networking.k8s.io_v1beta1.inputs.HTTPIngressPathArgs;
import java.util.List;
import java.util.Objects;


/**
 * HTTPIngressRuleValue is a list of http selectors pointing to backends. In the example: http://&lt;host&gt;/&lt;path&gt;?&lt;searchpart&gt; -&gt; backend where where parts of the url correspond to RFC 3986, this resource will be used to match against everything after the last &#39;/&#39; and before the first &#39;?&#39; or &#39;#&#39;.
 * 
 */
public final class HTTPIngressRuleValueArgs extends com.pulumi.resources.ResourceArgs {

    public static final HTTPIngressRuleValueArgs Empty = new HTTPIngressRuleValueArgs();

    /**
     * A collection of paths that map requests to backends.
     * 
     */
    @Import(name="paths", required=true)
      private final Output<List<HTTPIngressPathArgs>> paths;

    public Output<List<HTTPIngressPathArgs>> paths() {
        return this.paths;
    }

    public HTTPIngressRuleValueArgs(Output<List<HTTPIngressPathArgs>> paths) {
        this.paths = Objects.requireNonNull(paths, "expected parameter 'paths' to be non-null");
    }

    private HTTPIngressRuleValueArgs() {
        this.paths = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HTTPIngressRuleValueArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<List<HTTPIngressPathArgs>> paths;

        public Builder() {
    	      // Empty
        }

        public Builder(HTTPIngressRuleValueArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.paths = defaults.paths;
        }

        public Builder paths(Output<List<HTTPIngressPathArgs>> paths) {
            this.paths = Objects.requireNonNull(paths);
            return this;
        }
        public Builder paths(List<HTTPIngressPathArgs> paths) {
            this.paths = Output.of(Objects.requireNonNull(paths));
            return this;
        }
        public Builder paths(HTTPIngressPathArgs... paths) {
            return paths(List.of(paths));
        }        public HTTPIngressRuleValueArgs build() {
            return new HTTPIngressRuleValueArgs(paths);
        }
    }
}
