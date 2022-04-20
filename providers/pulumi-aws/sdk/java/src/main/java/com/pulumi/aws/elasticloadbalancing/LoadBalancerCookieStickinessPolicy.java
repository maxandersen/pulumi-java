// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.elasticloadbalancing;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.elasticloadbalancing.LoadBalancerCookieStickinessPolicyArgs;
import com.pulumi.aws.elasticloadbalancing.inputs.LoadBalancerCookieStickinessPolicyState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a load balancer cookie stickiness policy, which allows an ELB to control the sticky session lifetime of the browser.
 * 
 * ## Example Usage
 * 
 * @deprecated
 * aws.elasticloadbalancing.LoadBalancerCookieStickinessPolicy has been deprecated in favor of aws.elb.LoadBalancerCookieStickinessPolicy
 * 
 */
@Deprecated /* aws.elasticloadbalancing.LoadBalancerCookieStickinessPolicy has been deprecated in favor of aws.elb.LoadBalancerCookieStickinessPolicy */
@ResourceType(type="aws:elasticloadbalancing/loadBalancerCookieStickinessPolicy:LoadBalancerCookieStickinessPolicy")
public class LoadBalancerCookieStickinessPolicy extends com.pulumi.resources.CustomResource {
    /**
     * The time period after which
     * the session cookie should be considered stale, expressed in seconds.
     * 
     */
    @Export(name="cookieExpirationPeriod", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> cookieExpirationPeriod;

    /**
     * @return The time period after which
     * the session cookie should be considered stale, expressed in seconds.
     * 
     */
    public Output</* @Nullable */ Integer> cookieExpirationPeriod() {
        return this.cookieExpirationPeriod;
    }
    /**
     * The load balancer port to which the policy
     * should be applied. This must be an active listener on the load
     * balancer.
     * 
     */
    @Export(name="lbPort", type=Integer.class, parameters={})
    private Output<Integer> lbPort;

    /**
     * @return The load balancer port to which the policy
     * should be applied. This must be an active listener on the load
     * balancer.
     * 
     */
    public Output<Integer> lbPort() {
        return this.lbPort;
    }
    /**
     * The load balancer to which the policy
     * should be attached.
     * 
     */
    @Export(name="loadBalancer", type=String.class, parameters={})
    private Output<String> loadBalancer;

    /**
     * @return The load balancer to which the policy
     * should be attached.
     * 
     */
    public Output<String> loadBalancer() {
        return this.loadBalancer;
    }
    /**
     * The name of the stickiness policy.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the stickiness policy.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public LoadBalancerCookieStickinessPolicy(String name) {
        this(name, LoadBalancerCookieStickinessPolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public LoadBalancerCookieStickinessPolicy(String name, LoadBalancerCookieStickinessPolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public LoadBalancerCookieStickinessPolicy(String name, LoadBalancerCookieStickinessPolicyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:elasticloadbalancing/loadBalancerCookieStickinessPolicy:LoadBalancerCookieStickinessPolicy", name, args == null ? LoadBalancerCookieStickinessPolicyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private LoadBalancerCookieStickinessPolicy(String name, Output<String> id, @Nullable LoadBalancerCookieStickinessPolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:elasticloadbalancing/loadBalancerCookieStickinessPolicy:LoadBalancerCookieStickinessPolicy", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static LoadBalancerCookieStickinessPolicy get(String name, Output<String> id, @Nullable LoadBalancerCookieStickinessPolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new LoadBalancerCookieStickinessPolicy(name, id, state, options);
    }
}
