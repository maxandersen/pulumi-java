// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.kubernetes.core_v1.inputs.ContainerStatusArgs;
import com.pulumi.kubernetes.core_v1.inputs.PodConditionArgs;
import com.pulumi.kubernetes.core_v1.inputs.PodIPArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * PodStatus represents information about the status of a pod. Status may trail the actual state of a system, especially if the node that hosts the pod cannot contact the control plane.
 * 
 */
public final class PodStatusArgs extends com.pulumi.resources.ResourceArgs {

    public static final PodStatusArgs Empty = new PodStatusArgs();

    /**
     * Current service state of pod. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-conditions
     * 
     */
    @Import(name="conditions")
    private @Nullable Output<List<PodConditionArgs>> conditions;

    /**
     * @return Current service state of pod. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-conditions
     * 
     */
    public Optional<Output<List<PodConditionArgs>>> conditions() {
        return Optional.ofNullable(this.conditions);
    }

    /**
     * The list has one entry per container in the manifest. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-and-container-status
     * 
     */
    @Import(name="containerStatuses")
    private @Nullable Output<List<ContainerStatusArgs>> containerStatuses;

    /**
     * @return The list has one entry per container in the manifest. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-and-container-status
     * 
     */
    public Optional<Output<List<ContainerStatusArgs>>> containerStatuses() {
        return Optional.ofNullable(this.containerStatuses);
    }

    /**
     * Status for any ephemeral containers that have run in this pod. This field is beta-level and available on clusters that haven&#39;t disabled the EphemeralContainers feature gate.
     * 
     */
    @Import(name="ephemeralContainerStatuses")
    private @Nullable Output<List<ContainerStatusArgs>> ephemeralContainerStatuses;

    /**
     * @return Status for any ephemeral containers that have run in this pod. This field is beta-level and available on clusters that haven&#39;t disabled the EphemeralContainers feature gate.
     * 
     */
    public Optional<Output<List<ContainerStatusArgs>>> ephemeralContainerStatuses() {
        return Optional.ofNullable(this.ephemeralContainerStatuses);
    }

    /**
     * IP address of the host to which the pod is assigned. Empty if not yet scheduled.
     * 
     */
    @Import(name="hostIP")
    private @Nullable Output<String> hostIP;

    /**
     * @return IP address of the host to which the pod is assigned. Empty if not yet scheduled.
     * 
     */
    public Optional<Output<String>> hostIP() {
        return Optional.ofNullable(this.hostIP);
    }

    /**
     * The list has one entry per init container in the manifest. The most recent successful init container will have ready = true, the most recently started container will have startTime set. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-and-container-status
     * 
     */
    @Import(name="initContainerStatuses")
    private @Nullable Output<List<ContainerStatusArgs>> initContainerStatuses;

    /**
     * @return The list has one entry per init container in the manifest. The most recent successful init container will have ready = true, the most recently started container will have startTime set. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-and-container-status
     * 
     */
    public Optional<Output<List<ContainerStatusArgs>>> initContainerStatuses() {
        return Optional.ofNullable(this.initContainerStatuses);
    }

    /**
     * A human readable message indicating details about why the pod is in this condition.
     * 
     */
    @Import(name="message")
    private @Nullable Output<String> message;

    /**
     * @return A human readable message indicating details about why the pod is in this condition.
     * 
     */
    public Optional<Output<String>> message() {
        return Optional.ofNullable(this.message);
    }

    /**
     * nominatedNodeName is set only when this pod preempts other pods on the node, but it cannot be scheduled right away as preemption victims receive their graceful termination periods. This field does not guarantee that the pod will be scheduled on this node. Scheduler may decide to place the pod elsewhere if other nodes become available sooner. Scheduler may also decide to give the resources on this node to a higher priority pod that is created after preemption. As a result, this field may be different than PodSpec.nodeName when the pod is scheduled.
     * 
     */
    @Import(name="nominatedNodeName")
    private @Nullable Output<String> nominatedNodeName;

    /**
     * @return nominatedNodeName is set only when this pod preempts other pods on the node, but it cannot be scheduled right away as preemption victims receive their graceful termination periods. This field does not guarantee that the pod will be scheduled on this node. Scheduler may decide to place the pod elsewhere if other nodes become available sooner. Scheduler may also decide to give the resources on this node to a higher priority pod that is created after preemption. As a result, this field may be different than PodSpec.nodeName when the pod is scheduled.
     * 
     */
    public Optional<Output<String>> nominatedNodeName() {
        return Optional.ofNullable(this.nominatedNodeName);
    }

    /**
     * The phase of a Pod is a simple, high-level summary of where the Pod is in its lifecycle. The conditions array, the reason and message fields, and the individual container status arrays contain more detail about the pod&#39;s status. There are five possible phase values:
     * 
     * Pending: The pod has been accepted by the Kubernetes system, but one or more of the container images has not been created. This includes time before being scheduled as well as time spent downloading images over the network, which could take a while. Running: The pod has been bound to a node, and all of the containers have been created. At least one container is still running, or is in the process of starting or restarting. Succeeded: All containers in the pod have terminated in success, and will not be restarted. Failed: All containers in the pod have terminated, and at least one container has terminated in failure. The container either exited with non-zero status or was terminated by the system. Unknown: For some reason the state of the pod could not be obtained, typically due to an error in communicating with the host of the pod.
     * 
     * More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-phase
     * 
     */
    @Import(name="phase")
    private @Nullable Output<String> phase;

    /**
     * @return The phase of a Pod is a simple, high-level summary of where the Pod is in its lifecycle. The conditions array, the reason and message fields, and the individual container status arrays contain more detail about the pod&#39;s status. There are five possible phase values:
     * 
     * Pending: The pod has been accepted by the Kubernetes system, but one or more of the container images has not been created. This includes time before being scheduled as well as time spent downloading images over the network, which could take a while. Running: The pod has been bound to a node, and all of the containers have been created. At least one container is still running, or is in the process of starting or restarting. Succeeded: All containers in the pod have terminated in success, and will not be restarted. Failed: All containers in the pod have terminated, and at least one container has terminated in failure. The container either exited with non-zero status or was terminated by the system. Unknown: For some reason the state of the pod could not be obtained, typically due to an error in communicating with the host of the pod.
     * 
     * More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-phase
     * 
     */
    public Optional<Output<String>> phase() {
        return Optional.ofNullable(this.phase);
    }

    /**
     * IP address allocated to the pod. Routable at least within the cluster. Empty if not yet allocated.
     * 
     */
    @Import(name="podIP")
    private @Nullable Output<String> podIP;

    /**
     * @return IP address allocated to the pod. Routable at least within the cluster. Empty if not yet allocated.
     * 
     */
    public Optional<Output<String>> podIP() {
        return Optional.ofNullable(this.podIP);
    }

    /**
     * podIPs holds the IP addresses allocated to the pod. If this field is specified, the 0th entry must match the podIP field. Pods may be allocated at most 1 value for each of IPv4 and IPv6. This list is empty if no IPs have been allocated yet.
     * 
     */
    @Import(name="podIPs")
    private @Nullable Output<List<PodIPArgs>> podIPs;

    /**
     * @return podIPs holds the IP addresses allocated to the pod. If this field is specified, the 0th entry must match the podIP field. Pods may be allocated at most 1 value for each of IPv4 and IPv6. This list is empty if no IPs have been allocated yet.
     * 
     */
    public Optional<Output<List<PodIPArgs>>> podIPs() {
        return Optional.ofNullable(this.podIPs);
    }

    /**
     * The Quality of Service (QOS) classification assigned to the pod based on resource requirements See PodQOSClass type for available QOS classes More info: https://git.k8s.io/community/contributors/design-proposals/node/resource-qos.md
     * 
     */
    @Import(name="qosClass")
    private @Nullable Output<String> qosClass;

    /**
     * @return The Quality of Service (QOS) classification assigned to the pod based on resource requirements See PodQOSClass type for available QOS classes More info: https://git.k8s.io/community/contributors/design-proposals/node/resource-qos.md
     * 
     */
    public Optional<Output<String>> qosClass() {
        return Optional.ofNullable(this.qosClass);
    }

    /**
     * A brief CamelCase message indicating details about why the pod is in this state. e.g. &#39;Evicted&#39;
     * 
     */
    @Import(name="reason")
    private @Nullable Output<String> reason;

    /**
     * @return A brief CamelCase message indicating details about why the pod is in this state. e.g. &#39;Evicted&#39;
     * 
     */
    public Optional<Output<String>> reason() {
        return Optional.ofNullable(this.reason);
    }

    /**
     * RFC 3339 date and time at which the object was acknowledged by the Kubelet. This is before the Kubelet pulled the container image(s) for the pod.
     * 
     */
    @Import(name="startTime")
    private @Nullable Output<String> startTime;

    /**
     * @return RFC 3339 date and time at which the object was acknowledged by the Kubelet. This is before the Kubelet pulled the container image(s) for the pod.
     * 
     */
    public Optional<Output<String>> startTime() {
        return Optional.ofNullable(this.startTime);
    }

    private PodStatusArgs() {}

    private PodStatusArgs(PodStatusArgs $) {
        this.conditions = $.conditions;
        this.containerStatuses = $.containerStatuses;
        this.ephemeralContainerStatuses = $.ephemeralContainerStatuses;
        this.hostIP = $.hostIP;
        this.initContainerStatuses = $.initContainerStatuses;
        this.message = $.message;
        this.nominatedNodeName = $.nominatedNodeName;
        this.phase = $.phase;
        this.podIP = $.podIP;
        this.podIPs = $.podIPs;
        this.qosClass = $.qosClass;
        this.reason = $.reason;
        this.startTime = $.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PodStatusArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PodStatusArgs $;

        public Builder() {
            $ = new PodStatusArgs();
        }

        public Builder(PodStatusArgs defaults) {
            $ = new PodStatusArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param conditions Current service state of pod. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-conditions
         * 
         * @return builder
         * 
         */
        public Builder conditions(@Nullable Output<List<PodConditionArgs>> conditions) {
            $.conditions = conditions;
            return this;
        }

        /**
         * @param conditions Current service state of pod. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-conditions
         * 
         * @return builder
         * 
         */
        public Builder conditions(List<PodConditionArgs> conditions) {
            return conditions(Output.of(conditions));
        }

        /**
         * @param conditions Current service state of pod. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-conditions
         * 
         * @return builder
         * 
         */
        public Builder conditions(PodConditionArgs... conditions) {
            return conditions(List.of(conditions));
        }

        /**
         * @param containerStatuses The list has one entry per container in the manifest. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-and-container-status
         * 
         * @return builder
         * 
         */
        public Builder containerStatuses(@Nullable Output<List<ContainerStatusArgs>> containerStatuses) {
            $.containerStatuses = containerStatuses;
            return this;
        }

        /**
         * @param containerStatuses The list has one entry per container in the manifest. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-and-container-status
         * 
         * @return builder
         * 
         */
        public Builder containerStatuses(List<ContainerStatusArgs> containerStatuses) {
            return containerStatuses(Output.of(containerStatuses));
        }

        /**
         * @param containerStatuses The list has one entry per container in the manifest. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-and-container-status
         * 
         * @return builder
         * 
         */
        public Builder containerStatuses(ContainerStatusArgs... containerStatuses) {
            return containerStatuses(List.of(containerStatuses));
        }

        /**
         * @param ephemeralContainerStatuses Status for any ephemeral containers that have run in this pod. This field is beta-level and available on clusters that haven&#39;t disabled the EphemeralContainers feature gate.
         * 
         * @return builder
         * 
         */
        public Builder ephemeralContainerStatuses(@Nullable Output<List<ContainerStatusArgs>> ephemeralContainerStatuses) {
            $.ephemeralContainerStatuses = ephemeralContainerStatuses;
            return this;
        }

        /**
         * @param ephemeralContainerStatuses Status for any ephemeral containers that have run in this pod. This field is beta-level and available on clusters that haven&#39;t disabled the EphemeralContainers feature gate.
         * 
         * @return builder
         * 
         */
        public Builder ephemeralContainerStatuses(List<ContainerStatusArgs> ephemeralContainerStatuses) {
            return ephemeralContainerStatuses(Output.of(ephemeralContainerStatuses));
        }

        /**
         * @param ephemeralContainerStatuses Status for any ephemeral containers that have run in this pod. This field is beta-level and available on clusters that haven&#39;t disabled the EphemeralContainers feature gate.
         * 
         * @return builder
         * 
         */
        public Builder ephemeralContainerStatuses(ContainerStatusArgs... ephemeralContainerStatuses) {
            return ephemeralContainerStatuses(List.of(ephemeralContainerStatuses));
        }

        /**
         * @param hostIP IP address of the host to which the pod is assigned. Empty if not yet scheduled.
         * 
         * @return builder
         * 
         */
        public Builder hostIP(@Nullable Output<String> hostIP) {
            $.hostIP = hostIP;
            return this;
        }

        /**
         * @param hostIP IP address of the host to which the pod is assigned. Empty if not yet scheduled.
         * 
         * @return builder
         * 
         */
        public Builder hostIP(String hostIP) {
            return hostIP(Output.of(hostIP));
        }

        /**
         * @param initContainerStatuses The list has one entry per init container in the manifest. The most recent successful init container will have ready = true, the most recently started container will have startTime set. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-and-container-status
         * 
         * @return builder
         * 
         */
        public Builder initContainerStatuses(@Nullable Output<List<ContainerStatusArgs>> initContainerStatuses) {
            $.initContainerStatuses = initContainerStatuses;
            return this;
        }

        /**
         * @param initContainerStatuses The list has one entry per init container in the manifest. The most recent successful init container will have ready = true, the most recently started container will have startTime set. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-and-container-status
         * 
         * @return builder
         * 
         */
        public Builder initContainerStatuses(List<ContainerStatusArgs> initContainerStatuses) {
            return initContainerStatuses(Output.of(initContainerStatuses));
        }

        /**
         * @param initContainerStatuses The list has one entry per init container in the manifest. The most recent successful init container will have ready = true, the most recently started container will have startTime set. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-and-container-status
         * 
         * @return builder
         * 
         */
        public Builder initContainerStatuses(ContainerStatusArgs... initContainerStatuses) {
            return initContainerStatuses(List.of(initContainerStatuses));
        }

        /**
         * @param message A human readable message indicating details about why the pod is in this condition.
         * 
         * @return builder
         * 
         */
        public Builder message(@Nullable Output<String> message) {
            $.message = message;
            return this;
        }

        /**
         * @param message A human readable message indicating details about why the pod is in this condition.
         * 
         * @return builder
         * 
         */
        public Builder message(String message) {
            return message(Output.of(message));
        }

        /**
         * @param nominatedNodeName nominatedNodeName is set only when this pod preempts other pods on the node, but it cannot be scheduled right away as preemption victims receive their graceful termination periods. This field does not guarantee that the pod will be scheduled on this node. Scheduler may decide to place the pod elsewhere if other nodes become available sooner. Scheduler may also decide to give the resources on this node to a higher priority pod that is created after preemption. As a result, this field may be different than PodSpec.nodeName when the pod is scheduled.
         * 
         * @return builder
         * 
         */
        public Builder nominatedNodeName(@Nullable Output<String> nominatedNodeName) {
            $.nominatedNodeName = nominatedNodeName;
            return this;
        }

        /**
         * @param nominatedNodeName nominatedNodeName is set only when this pod preempts other pods on the node, but it cannot be scheduled right away as preemption victims receive their graceful termination periods. This field does not guarantee that the pod will be scheduled on this node. Scheduler may decide to place the pod elsewhere if other nodes become available sooner. Scheduler may also decide to give the resources on this node to a higher priority pod that is created after preemption. As a result, this field may be different than PodSpec.nodeName when the pod is scheduled.
         * 
         * @return builder
         * 
         */
        public Builder nominatedNodeName(String nominatedNodeName) {
            return nominatedNodeName(Output.of(nominatedNodeName));
        }

        /**
         * @param phase The phase of a Pod is a simple, high-level summary of where the Pod is in its lifecycle. The conditions array, the reason and message fields, and the individual container status arrays contain more detail about the pod&#39;s status. There are five possible phase values:
         * 
         * Pending: The pod has been accepted by the Kubernetes system, but one or more of the container images has not been created. This includes time before being scheduled as well as time spent downloading images over the network, which could take a while. Running: The pod has been bound to a node, and all of the containers have been created. At least one container is still running, or is in the process of starting or restarting. Succeeded: All containers in the pod have terminated in success, and will not be restarted. Failed: All containers in the pod have terminated, and at least one container has terminated in failure. The container either exited with non-zero status or was terminated by the system. Unknown: For some reason the state of the pod could not be obtained, typically due to an error in communicating with the host of the pod.
         * 
         * More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-phase
         * 
         * @return builder
         * 
         */
        public Builder phase(@Nullable Output<String> phase) {
            $.phase = phase;
            return this;
        }

        /**
         * @param phase The phase of a Pod is a simple, high-level summary of where the Pod is in its lifecycle. The conditions array, the reason and message fields, and the individual container status arrays contain more detail about the pod&#39;s status. There are five possible phase values:
         * 
         * Pending: The pod has been accepted by the Kubernetes system, but one or more of the container images has not been created. This includes time before being scheduled as well as time spent downloading images over the network, which could take a while. Running: The pod has been bound to a node, and all of the containers have been created. At least one container is still running, or is in the process of starting or restarting. Succeeded: All containers in the pod have terminated in success, and will not be restarted. Failed: All containers in the pod have terminated, and at least one container has terminated in failure. The container either exited with non-zero status or was terminated by the system. Unknown: For some reason the state of the pod could not be obtained, typically due to an error in communicating with the host of the pod.
         * 
         * More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-phase
         * 
         * @return builder
         * 
         */
        public Builder phase(String phase) {
            return phase(Output.of(phase));
        }

        /**
         * @param podIP IP address allocated to the pod. Routable at least within the cluster. Empty if not yet allocated.
         * 
         * @return builder
         * 
         */
        public Builder podIP(@Nullable Output<String> podIP) {
            $.podIP = podIP;
            return this;
        }

        /**
         * @param podIP IP address allocated to the pod. Routable at least within the cluster. Empty if not yet allocated.
         * 
         * @return builder
         * 
         */
        public Builder podIP(String podIP) {
            return podIP(Output.of(podIP));
        }

        /**
         * @param podIPs podIPs holds the IP addresses allocated to the pod. If this field is specified, the 0th entry must match the podIP field. Pods may be allocated at most 1 value for each of IPv4 and IPv6. This list is empty if no IPs have been allocated yet.
         * 
         * @return builder
         * 
         */
        public Builder podIPs(@Nullable Output<List<PodIPArgs>> podIPs) {
            $.podIPs = podIPs;
            return this;
        }

        /**
         * @param podIPs podIPs holds the IP addresses allocated to the pod. If this field is specified, the 0th entry must match the podIP field. Pods may be allocated at most 1 value for each of IPv4 and IPv6. This list is empty if no IPs have been allocated yet.
         * 
         * @return builder
         * 
         */
        public Builder podIPs(List<PodIPArgs> podIPs) {
            return podIPs(Output.of(podIPs));
        }

        /**
         * @param podIPs podIPs holds the IP addresses allocated to the pod. If this field is specified, the 0th entry must match the podIP field. Pods may be allocated at most 1 value for each of IPv4 and IPv6. This list is empty if no IPs have been allocated yet.
         * 
         * @return builder
         * 
         */
        public Builder podIPs(PodIPArgs... podIPs) {
            return podIPs(List.of(podIPs));
        }

        /**
         * @param qosClass The Quality of Service (QOS) classification assigned to the pod based on resource requirements See PodQOSClass type for available QOS classes More info: https://git.k8s.io/community/contributors/design-proposals/node/resource-qos.md
         * 
         * @return builder
         * 
         */
        public Builder qosClass(@Nullable Output<String> qosClass) {
            $.qosClass = qosClass;
            return this;
        }

        /**
         * @param qosClass The Quality of Service (QOS) classification assigned to the pod based on resource requirements See PodQOSClass type for available QOS classes More info: https://git.k8s.io/community/contributors/design-proposals/node/resource-qos.md
         * 
         * @return builder
         * 
         */
        public Builder qosClass(String qosClass) {
            return qosClass(Output.of(qosClass));
        }

        /**
         * @param reason A brief CamelCase message indicating details about why the pod is in this state. e.g. &#39;Evicted&#39;
         * 
         * @return builder
         * 
         */
        public Builder reason(@Nullable Output<String> reason) {
            $.reason = reason;
            return this;
        }

        /**
         * @param reason A brief CamelCase message indicating details about why the pod is in this state. e.g. &#39;Evicted&#39;
         * 
         * @return builder
         * 
         */
        public Builder reason(String reason) {
            return reason(Output.of(reason));
        }

        /**
         * @param startTime RFC 3339 date and time at which the object was acknowledged by the Kubelet. This is before the Kubelet pulled the container image(s) for the pod.
         * 
         * @return builder
         * 
         */
        public Builder startTime(@Nullable Output<String> startTime) {
            $.startTime = startTime;
            return this;
        }

        /**
         * @param startTime RFC 3339 date and time at which the object was acknowledged by the Kubelet. This is before the Kubelet pulled the container image(s) for the pod.
         * 
         * @return builder
         * 
         */
        public Builder startTime(String startTime) {
            return startTime(Output.of(startTime));
        }

        public PodStatusArgs build() {
            return $;
        }
    }

}
